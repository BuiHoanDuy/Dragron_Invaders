package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import controller.keyHandler;
import entity.Monster;
import entity.MonsterList;
import entity.Player;
import entity.bulletList;
import entity.monsterBulletList;

public class GamePanel extends JPanel implements Runnable {
	public int countLoop, countForMonsterBullet;
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
	
	public Player player = new Player(this, keyH);
	public MonsterList monsterList = new MonsterList(this);
	public bulletList bulletList = new bulletList(this);
	public monsterBulletList monsterBulletList = new monsterBulletList(this);
	
	public GamePanel() {
		countLoop = 0; countForMonsterBullet = 0;
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
		this.addKeyListener(keyH);
		this.setFocusable(true);
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
		monsterList.update(1);
		bulletList.update();
		monsterBulletList.update();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		player.draw(g2);
		
		monsterList.draw(g2);
		
		bulletList.draw(g2);

		monsterBulletList.draw(g2);
		
		g2.dispose();
	}
}
