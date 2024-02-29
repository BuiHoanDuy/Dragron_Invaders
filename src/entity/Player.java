package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.keyHandler;
import main.GamePanel;

public class Player extends Entity {
	GamePanel gp;
	keyHandler KeyH;
	public int lifes;
	public Player(GamePanel gp, keyHandler KeyH) {
		this.gp = gp;
		this.KeyH = KeyH;
		
		setDefaultValue();
		getPlayerImage();
	}

	public void setDefaultValue() {
		// set default pposition
		x = 500;
		y = 570;
		speed = 8;
		direction = "up";
		lifes = 5;
	}

	public void getPlayerImage() {
		try {
			mainCharacter = ImageIO.read(getClass().getResourceAsStream("/res/plane_white_simple.png"));
			HP = ImageIO.read(getClass().getResourceAsStream("/res/green_HP.png"));
			gp.gameOverImage = ImageIO.read(getClass().getResourceAsStream("/res/game_over.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public void update() {
		if (KeyH.upPressed == true) {
			direction = "up";
			y -= speed;
		} else if (KeyH.downPressed == true) {
			direction = "down";
			y += speed;
		} else if (KeyH.leftPressed == true) {
			direction = "left";
			x -= speed;
		} else if (KeyH.rightPressed == true) {
			direction = "right";
			x += speed;
		}
		
		checkIntersect();
	}

	public void draw(Graphics2D g2) {
		BufferedImage image = mainCharacter;
		BufferedImage image_HP = HP;
		g2.drawImage(image, x, y, gp.tileSize * 2, gp.tileSize*2, null);
		
		if (lifes == 5) {
			g2.drawImage(image_HP, x, y+80, gp.tileSize * 2, 20, null);
		} else if (lifes == 4) {
			g2.drawImage(image_HP, x, y+80, gp.tileSize * 2 - 20, 20, null);
		} else if (lifes == 3) {
			g2.drawImage(image_HP, x, y+80, gp.tileSize * 2 - 40, 20, null);
		} else if (lifes == 2) {
			g2.drawImage(image_HP, x, y+80, gp.tileSize * 2 - 60, 20, null);
		} else if (lifes == 1) {
			g2.drawImage(image_HP, x, y+80, gp.tileSize * 2 - 80, 20, null);
		
		} else if (lifes == 0) {
			System.out.println("Game Over");
			g2.drawImage(gp.gameOverImage, 400, 250, 270, 48, null);
			gp.playSE(7);
			lifes = -1;
		} else if (lifes == -1) {
			g2.drawImage(gp.gameOverImage, 400, 250, 270, 48, null);
		}
		
	}
	
	public void checkIntersect() { // kiểm tra máy bay có chạm vào viên đạn của Monster chưa.
		for (int i = 0; i < gp.monsterBulletList.bullet.size(); i++) {
			if (x+48 >= gp.monsterBulletList.bullet.get(i).x-20 && x <= gp.monsterBulletList.bullet.get(i).x + 40 &&
				 y+48 >= gp.monsterBulletList.bullet.get(i).y && y <= gp.monsterBulletList.bullet.get(i).y +20 ) {
				gp.monsterBulletList.bullet.remove(i);
				
				// do something when Die
				System.out.println("die");
				gp.playSE(6);
				lifes--;
			}
		}
	}
	
}
