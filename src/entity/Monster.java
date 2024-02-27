package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.Destination;

import controller.keyHandler;
import main.GamePanel;

public class Monster extends Entity {
	GamePanel gp;

	boolean status; // whether monster hasn't dead or not;
	public BufferedImage monsterBulletImage;
	public int desX_Bullet, desY_Bullet; // the positon of  monster bullet

	public Monster(GamePanel gp) {
		this.gp = gp;
	}

	public Monster(GamePanel gp, int desX, int desY) {
		this.gp = gp;
		destinationPosionX = desX;
		destinationPosionY = desY;
		status = true;
		

		setDefaultValue();
		getMonsterImage();
	}

	public void setDefaultValue() {
		// set default pposition
		x = 0;
		y = 0;
		speed = 4;
		
		desX_Bullet = 48;
		desY_Bullet = 0;
		
	}

	public void getMonsterImage() {
		try {

			first = ImageIO.read(getClass().getResourceAsStream("/res/red_dragon1.png"));

			second = ImageIO.read(getClass().getResourceAsStream("/res/red_dragon2.png"));

			third = ImageIO.read(getClass().getResourceAsStream("/res/red_dragon3.png"));
			
			monsterBulletImage = ImageIO.read(getClass().getResourceAsStream("/res/bullet/fire_bullet.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void update() {

		// reset counter
		if (gp.countLoop > 15) {
			gp.countLoop = 0;
		}
	}

	public void draw(Graphics2D g2) {

		BufferedImage image = null;

		switch (gp.countLoop) {
		case 0, 1, 2, 3:
			image = first;
			break;
		case 4, 5, 6, 7:
			image = second;
			break;
		case 8, 9, 10, 11:
			image = third;
			break;
		case 12, 13, 14, 15:
			image = second;
		default:
			image = image;
			break;
		}
		g2.drawImage(image, x, y, gp.tileSize * 2, gp.tileSize, null);
	}
	
	public void drawMonsterBullet(Graphics2D g2) {

		BufferedImage image = monsterBulletImage;

		g2.drawImage(image, desX_Bullet, desY_Bullet, gp.tileSize , gp.tileSize, null);
	}

	public void move(int xx, int yy) { // move monster slowly to the determined point
		if (x == xx && y == yy)
			return;
		else {
			if (x < xx) {
				x += speed;
			}
			else if (x > xx){
				x -= speed;
			}
			
			if (y < yy) {
				y += speed;
			}
			else if (y > yy) {
				y -= speed;
			}
		}
		
		if (desY_Bullet < 750) {
			desY_Bullet += speed;
		}
	}

}
