package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import controller.keyHandler;
import controller.mouseController;
import entity.BlueItemList;
import entity.BossList;
import entity.GreenItemList;
import entity.Monster;
import entity.MonsterList;
import entity.Player;
import entity.RedItemList;
import entity.bulletList;
import entity.monsterBulletList;

public class GamePanel extends JPanel implements Runnable {
	public int menuCheck;
	Menu menu = new Menu(this);

	public int round = 1; // màn người chơi đang chơi
	public int monsterBulletSpeed = 4; // tốc dộ đạn rơi của MOnster. Tăng speed lên ở phần vẽ map.
	public int monsterBulletPercentageRandom = 5; // tỉ lệ nhả đạn của Monster. Tăng lên ở phần vẽ map.
	public int monsterLevel = 0; // level of monster, set in monsterList
	public int bossLevel = 0; // level of Boss, set value in bossList

	public int bulletLevel; // level of Bullet
	public int ultiTotal; // amount of ulti player can use.

	public BufferedImage gameOverImage;
	public int countLoop, countForMonsterBullet; // countForMonsterBullet_max = 50; countLoop_max = 15;
	public boolean ultiFlag, bossFlag; // boss flag set in Round14 in MOnsterList_Class
	// screen setting
	final int originalTileSize = 16; // 16x16
	final int scale = 3;

	public final int tileSize = originalTileSize * scale; // 48x48
	final int maxScreenCol = 21;
	final int maxScreenRow = 15;

	final int screenWidth = tileSize * maxScreenCol; // 1008px
	final int screenHeight = tileSize * maxScreenRow; // 720px

	int fps = 60;

	Thread gameThread; // fps
	keyHandler keyH = new keyHandler();
	mouseController Mouse = new mouseController(this);
	Sound sound = new Sound();

	public Player player = new Player(this, keyH);
	public MonsterList monsterList = new MonsterList(this);
	public bulletList bulletList = new bulletList(this);
	public monsterBulletList monsterBulletList = new monsterBulletList(this);
	public BossList bossList = new BossList(this);

	public BlueItemList blue = new BlueItemList(this);
	public RedItemList red = new RedItemList(this);
	public GreenItemList green = new GreenItemList(this);

	public GamePanel() {
		countLoop = 0;
		countForMonsterBullet = 0;
		bulletLevel = 1;
		ultiTotal = 0;
		ultiFlag = false;
		bossFlag = false;
		menuCheck = 0;
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);

		this.addMouseListener(Mouse);
		this.addMouseMotionListener(Mouse);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		playMusic(0);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {

		// --------- set FPS ------------
		double drawInterval = 1000000000 / fps; // 0,01666seconds
		double nextDrawTime = System.nanoTime() + drawInterval;
		while (gameThread != null) {
			// update:
			update();

			// draw:
			repaint();

			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime / 1000000;

				if (remainingTime < 0) {
					remainingTime = 0;
				}

				Thread.sleep((long) remainingTime);

				nextDrawTime += drawInterval;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// -----------------------------

	}

	public void update() {
		if (menuCheck == 1) {
			countLoop++;
			countForMonsterBullet++;
			
			player.update();
			monsterList.update(round);
			bulletList.update();
			monsterBulletList.update();
			blue.update();
			red.update();
			green.update();
			bossList.update();
		}
		if (player.lifes <= 0) {
			menuCheck = 0;
			player.lifes = 5;
			round = 1;
			bulletLevel = 1;
			ultiTotal = 0;
			monsterList.reset();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		drawBackground(g2);

		if (menuCheck == 1) {
			player.draw(g2);

			monsterList.draw(g2);

			bulletList.draw(g2);

			monsterBulletList.draw(g2);

			bossList.draw(g2);

			blue.draw(g2);
			red.draw(g2);
			green.draw(g2);
		} else {
			menu.draw(g2, menuCheck);
		}

		g2.dispose();
	}

	public void playMusic(int i) {
		sound.setFile(i);
		sound.play();
		sound.loop();
	}

	public void stopMusic() {
		sound.stop();
	}

	public void playSE(int i) { // sound effect
		sound.setFile(i);
		sound.play();
	}

	public void drawBackground(Graphics2D g2) {
		BufferedImage background = null;
		BufferedImage pauseIcon = null;
		try {
			background = ImageIO.read(getClass().getResourceAsStream("/res/background_galaxy.png"));
			pauseIcon = ImageIO.read(getClass().getResourceAsStream("/res/pause_icon.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2.drawImage(background, 0, 0, screenWidth, screenHeight, null);
		g2.drawImage(pauseIcon, 0, 0, 50, 50, null);

	}

	public void setValueForMonster(int monsterLevel, int monsterBuletSpeed, int monsterBulletPercentageRandom) {
		this.monsterLevel = monsterLevel;
		this.monsterBulletSpeed = monsterBuletSpeed;
		this.monsterBulletPercentageRandom = monsterBulletPercentageRandom;
	}
}
