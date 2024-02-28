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

	public Player(GamePanel gp, keyHandler KeyH) {
		this.gp = gp;
		this.KeyH = KeyH;

		setDefaultValue();
		getPlayerImage();
	}

	public void setDefaultValue() {
		// set default pposition
		x = 500;
		y = 630;
		speed = 8;
		direction = "up";
	}

	public void getPlayerImage() {
		try {
			mainCharacter = ImageIO.read(getClass().getResourceAsStream("/res/plane_white_simple.png"));
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

		g2.drawImage(image, x, y, gp.tileSize * 2, gp.tileSize*2, null);
	}
	
	public void checkIntersect() { // kiểm tra máy bay có chạm vào viên đạn của Monster chưa.
		for (int i = 0; i < gp.monsterBulletList.bullet.size(); i++) {
			if (x+48 >= gp.monsterBulletList.bullet.get(i).x-20 && x <= gp.monsterBulletList.bullet.get(i).x + 40 &&
				 y+48 >= gp.monsterBulletList.bullet.get(i).y && y <= gp.monsterBulletList.bullet.get(i).y +20 ) {
				gp.monsterBulletList.bullet.remove(i);
				System.out.println("die");
			}
		}
	}
	
}
