package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Bullet extends Entity{
	GamePanel gp;

	private BufferedImage bullet1;
	private BufferedImage bullet2;
	private BufferedImage bullet3;
	private BufferedImage bullet4;
	private BufferedImage bullet5;
	public int bulletLevel; 

	public Bullet(GamePanel gp) {
		this.gp = gp;
	}
	
	public Bullet(GamePanel gp, int desX, int desY) {
		this.gp = gp;
		destinationPosionX = desX;
		destinationPosionY = desY;
		bulletLevel = 1;

		setDefaultValue();
		getBulletImage();
	}

	public void setDefaultValue() {
		// set default pposition
		x = gp.player.x + 37; // cộng 37 để đạn trôi vào chính giữa của máy bay
		y = gp.player.y;
		speed = 8;
	}
	public void setValue(int xx, int yy) {
		x = xx; 
		y = yy;
	}

	public void getBulletImage() {
		try {

			bullet1 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_2.png"));

			bullet2 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_2.png"));

			bullet3 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_3.png"));	
			
			bullet4 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_4.png"));

			bullet5 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_5.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void update() {
		
		
	}

	public void draw(Graphics2D g2) {

		BufferedImage image = null;

		switch (bulletLevel) {
		case 1:
			image = bullet1;
			break;
		case 2:
			image = bullet2;
			break;
		case 3:
			image = bullet3;
			break;
		case 4:
			image = bullet4;
			break;
		case 5:
			image = bullet5;
			break;
		default:
			image = image;
			break;
		}
		g2.drawImage(image, x, y, 20, 20, null);
	}

	public void move(int xx, int yy) { // move bullet slowly to the determined point
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

	}
}
