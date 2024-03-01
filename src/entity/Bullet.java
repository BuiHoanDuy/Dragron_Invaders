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
	public BufferedImage monsterBulletImage;
	
	private BufferedImage wind1;
	private BufferedImage wind2;
	private BufferedImage wind3;
	private BufferedImage wind4;
	private BufferedImage wind5;
	
	private BufferedImage fire1;
	private BufferedImage fire2;
	private BufferedImage fire3;
	private BufferedImage fire4;
	private BufferedImage fire5;
	private BufferedImage fire6;
	private BufferedImage fire7;

	public Bullet(GamePanel gp) {
		this.gp = gp;
	}
	
	public Bullet(GamePanel gp, double desX, int desY, int monsterBulletSpeed) {
		this.gp = gp;
		destinationPosionX = desX;
		destinationPosionY = desY;
		//speed = monsterBulletSpeed;

		setDefaultValue(monsterBulletSpeed);
		getMonsterBulletImage();
		getBulletImage();
	}
	
	public Bullet(GamePanel gp, int desX, int desY, int xx, int yy, int monsterBulletSpeed) {
		this.gp = gp;
		destinationPosionX = desX;
		destinationPosionY = desY;
		//speed = monsterBulletSpeed;
		
		setDefaultValue(monsterBulletSpeed);
		getMonsterBulletImage();
		getBulletImage();
		x = xx; 
		y = yy;
	}

	public void setDefaultValue(int monsterBulletSpeed) {
		// set default pposition
		x = gp.player.x + 37; // cộng 37 để đạn trôi vào chính giữa của máy bay
		y = gp.player.y;
		speed = monsterBulletSpeed;
	}

	public void getMonsterBulletImage() {
		try {
			monsterBulletImage = ImageIO.read(getClass().getResourceAsStream("/res/bullet/fire_bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getBulletImage() {
		try {		
			bullet1 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_4.png")); // default

			bullet2 = ImageIO.read(getClass().getResourceAsStream("/res/bullet/bullet_5.png")); // Red - ground
			
			wind1= ImageIO.read(getClass().getResourceAsStream("/res//wind_ball/LightEffect_16.png"));
			wind2= ImageIO.read(getClass().getResourceAsStream("/res//wind_ball/LightEffect_17.png"));
			wind3= ImageIO.read(getClass().getResourceAsStream("/res//wind_ball/LightEffect_18.png"));
			wind4= ImageIO.read(getClass().getResourceAsStream("/res//wind_ball/LightEffect_19.png"));
			wind5= ImageIO.read(getClass().getResourceAsStream("/res//wind_ball/LightEffect_20.png"));
			
			fire1 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_04.png"));
			fire2 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_08.png"));
			fire3 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_12.png"));
			fire4 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_16.png"));
			fire5 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_20.png"));
			fire6 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_24.png"));
			fire7 = ImageIO.read(getClass().getResourceAsStream("/res//fire_ball/Effects_Fire_0_28.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void update() {
		
		
	}

	public void drawWindBall(Graphics2D g2) {

		BufferedImage image = null;

		switch (gp.countLoop) {
		case 1,2,3:
			image = wind1;
			break;
		case 4,5,6:
			image = wind2;
			break;
		case 7,8,9:
			image = wind3;
			break;
		case 10,11,12:
			image = wind4;
			break;
		case 13,14,15:
			image = wind5;
			break;
		default:
			image = wind1;
			break;
		}
		g2.drawImage(image, x-2, y, 60, 60, null);
	}
	
	public void drawFireBall(Graphics2D g2) {

		BufferedImage image = null;


		switch (gp.countLoop) {
		case 1,2:
			image = fire1;
			break;
		case 3,4:
			image = fire2;
			break;
		case 5,6:
			image =fire3;
			break;
		case 7,8:
			image = fire4;
			break;
		case 9,10:
			image = fire5;
			break;
		case 11,12:
			image = fire6;
			break;
		case 13,14,15:
			image = fire7;
			break;
		default:
			image = fire1;
			break;
		}
		g2.drawImage(image, x-2, y, 40, 60, null);
	}
	
	
	public void draw(Graphics2D g2) {

		BufferedImage image = null;

		switch (gp.bulletLevel) {
		case 1:
			image = bullet1;
			break;
		case 2:
			image = bullet2;
			break;
		default:
			image = bullet2;
			break;
		}
		g2.drawImage(image, x-2, y, 25, 30, null);
	}
	
	public void drawMonsterBullet(Graphics2D g2) {

		BufferedImage image = monsterBulletImage;

		g2.drawImage(image, x , y, gp.tileSize , gp.tileSize, null);
	}
	
	public void move(double destinationPosionX, int yy) { // move bullet slowly to the determined point
		if (x == destinationPosionX && y == yy)
			return;
		else {
			if (x < destinationPosionX) {
				x += speed;
			}
			else if (x > destinationPosionX){
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
