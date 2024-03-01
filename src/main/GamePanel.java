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
import entity.BlueItemList;
import entity.GreenItemList;
import entity.Monster;
import entity.MonsterList;
import entity.Player;
import entity.RedItemList;
import entity.bulletList;
import entity.monsterBulletList;

public class GamePanel extends JPanel implements Runnable {
	public int round = 0; // màn người chơi đang chơi
	public int monsterBulletSpeed = 4; // tốc dộ đạn rơi của MOnster. Tăng speed lên ở phần vẽ map.
	public int monsterBulletPercentageRandom = 5; // tỉ lệ nhả đạn của Monster. Tăng lên ở phần vẽ map.
	public int monsterLevel = 0;
	
	public int bulletLevel;  // level of Bullet
	public int ultiTotal; // amount of ulti player can use. 
	
	public BufferedImage gameOverImage;
	public int countLoop, countForMonsterBullet; // countForMonsterBullet_max = 50; countLoop_max = 15;
	public boolean ultiFlag;
	// screen setting
	final int originalTileSize = 16; //16x16
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // 48x48
	final int maxScreenCol = 21; 
	final int maxScreenRow = 15; 
	
	final int screenWidth = tileSize * maxScreenCol; // 1008px
	final int screenHeight = tileSize * maxScreenRow; // 720px
	
	int fps = 60;
	
	Thread gameThread; // fps
	keyHandler keyH = new keyHandler();
	Sound sound = new Sound();
	
	public Player player = new Player(this, keyH);
	public MonsterList monsterList = new MonsterList(this);
	public bulletList bulletList = new bulletList(this);
	public monsterBulletList monsterBulletList = new monsterBulletList(this);
	
	public BlueItemList blue = new BlueItemList(this);
	public RedItemList red = new RedItemList(this);
	public GreenItemList green = new GreenItemList(this);
	
	public GamePanel() {
		countLoop = 0; countForMonsterBullet = 0; bulletLevel = 1; ultiTotal = 0; ultiFlag =  false;
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
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
		while(gameThread != null) {
			// update:
			update();
			
			// draw:
			repaint();
			
			
			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime/1000000;
				
				if (remainingTime < 0) {
					remainingTime = 0;
				}
				
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				countLoop ++; countForMonsterBullet++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// -----------------------------
		
	}
	
	public void update() {
		player.update();
		monsterList.update(round);
		bulletList.update();
		monsterBulletList.update();
		blue.update();
		red.update();
		green.update();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		drawBackground(g2);
		
		player.draw(g2);
		
		monsterList.draw(g2);
		
		bulletList.draw(g2);

		monsterBulletList.draw(g2);
		
		blue.draw(g2);
		red.draw(g2);
		green.draw(g2);
		
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
		try {
			background = ImageIO.read(getClass().getResourceAsStream("/res/background_galaxy.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2.drawImage(background, 0, 0, screenWidth, screenHeight, null);
		
	}
	public void setValueForMonster(int monsterLevel, int monsterBuletSpeed, int monsterBulletPercentageRandom) {
		this.monsterLevel = monsterLevel;
		this.monsterBulletSpeed = monsterBuletSpeed;
		this.monsterBulletPercentageRandom = monsterBulletPercentageRandom;
	}
}
