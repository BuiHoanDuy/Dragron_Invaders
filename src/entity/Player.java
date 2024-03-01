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
	private int spaceNum;
	private int count; // to use ulti, if count == 10000 then reset bulletLevel like past
	private boolean flag;

	public Player(GamePanel gp, keyHandler KeyH) {
		this.gp = gp;
		this.KeyH = KeyH;

		setDefaultValue();
		getPlayerImage();
	}

	public void setDefaultValue() {
		// set default pposition
		count = 0; flag = false; 
		x = 500;
		y = 570;
		speed = 8;
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
		count++;
		if (KeyH.upPressed == true) {
			y -= speed;
		} else if (KeyH.downPressed == true) {
			y += speed;
		} else if (KeyH.leftPressed == true) {
			x -= speed;
		} else if (KeyH.rightPressed == true) {
			x += speed;
		} else if (KeyH.spacePressed == true) {
			flag = true;
			count = 0;
		}

		checkIntersect();
		checkBoostItem();
	}

	public void draw(Graphics2D g2) {
		BufferedImage image = mainCharacter;
		BufferedImage image_HP = HP;
		g2.drawImage(image, x, y, gp.tileSize * 2, gp.tileSize * 2, null);

		if (lifes == 5) {
			g2.drawImage(image_HP, x, y + 80, gp.tileSize * 2, 20, null);
		} else if (lifes == 4) {
			g2.drawImage(image_HP, x, y + 80, gp.tileSize * 2 - 20, 20, null);
		} else if (lifes == 3) {
			g2.drawImage(image_HP, x, y + 80, gp.tileSize * 2 - 40, 20, null);
		} else if (lifes == 2) {
			g2.drawImage(image_HP, x, y + 80, gp.tileSize * 2 - 60, 20, null);
		} else if (lifes == 1) {
			g2.drawImage(image_HP, x, y + 80, gp.tileSize * 2 - 80, 20, null);

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
			if (x + 48 >= gp.monsterBulletList.bullet.get(i).x - 20 && x <= gp.monsterBulletList.bullet.get(i).x + 40
					&& y + 48 >= gp.monsterBulletList.bullet.get(i).y
					&& y <= gp.monsterBulletList.bullet.get(i).y + 20) {
				gp.monsterBulletList.bullet.remove(i);

				// do something when Die
				System.out.println("die");
				gp.playSE(6);
				lifes--;
			}
		}
	}

	public void checkBoostItem() { // kiểm tra máy bay có chạm vào viên đạn của Monster chưa.
		if (flag == true) {
			if (gp.ultiTotal < 1) {
				flag = false;
			}
			else {
				gp.ultiFlag = true;
				count ++;
				System.out.println(count);
				if (count > 500) {
					gp.ultiFlag = false;
					gp.ultiTotal--;
					gp.bulletList.bullet.clear();
					System.out.println("HetHanSuDung");
					count = 0;
					flag = false;
				}
			}
		}

		for (int i = 0; i < gp.red.RedItemList.size(); i++) {
			if (x + 96 >= gp.red.RedItemList.get(i).x && x <= gp.red.RedItemList.get(i).x + 48
					&& y + 48 >= gp.red.RedItemList.get(i).y && y <= gp.red.RedItemList.get(i).y + 48) {
				gp.red.RedItemList.remove(i);

				// do something when Die
				gp.playSE(8);
				gp.ultiTotal++;
			}
		}

		for (int i = 0; i < gp.green.GreenItemList.size(); i++) {
			if (x + 96 >= gp.green.GreenItemList.get(i).x && x <= gp.green.GreenItemList.get(i).x + 48
					&& y + 48 >= gp.green.GreenItemList.get(i).y && y <= gp.green.GreenItemList.get(i).y + 48) {
				gp.green.GreenItemList.remove(i);

				// do something when Die
				gp.playSE(8);
				if (gp.bulletLevel <= 9) {
					gp.bulletLevel++;
				}
			}
		}

		for (int i = 0; i < gp.blue.BlueItemList.size(); i++) {
			if (x + 96 >= gp.blue.BlueItemList.get(i).x && x <= gp.blue.BlueItemList.get(i).x + 48
					&& y + 48 >= gp.blue.BlueItemList.get(i).y && y <= gp.blue.BlueItemList.get(i).y + 48) {
				gp.blue.BlueItemList.remove(i);

				// do something when Die
				gp.playSE(8);
				if (lifes < 5) {
					lifes++;
				}
			}
		}
	}

}
