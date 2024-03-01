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

	public int lifes;

	public Monster(GamePanel gp) {
		this.gp = gp;
	}

	public Monster(GamePanel gp, int desX, int desY, int life) {
		this.gp = gp;
		destinationPosionX = desX;
		destinationPosionY = desY;
		lifes = life;

		setDefaultValue();
		getMonsterImage();
	}

	public void setDefaultValue() {
		// set default pposition
		x = 432;
		y = 0;
		speed = 4;

	}

	public void getMonsterImage() {
		try {

			first = ImageIO.read(getClass().getResourceAsStream("/res/red_dragon1.png"));

			second = ImageIO.read(getClass().getResourceAsStream("/res/red_dragon2.png"));

			third = ImageIO.read(getClass().getResourceAsStream("/res/red_dragon3.png"));

			firstYellow = ImageIO.read(getClass().getResourceAsStream("/res/yellow_dragon1.png"));

			secondYellow = ImageIO.read(getClass().getResourceAsStream("/res/yellow_dragon2.png"));

			thirdYellow = ImageIO.read(getClass().getResourceAsStream("/res/yellow_dragon3.png"));
			
			firstBlue = ImageIO.read(getClass().getResourceAsStream("/res/blue_dragon21.png"));

			secondBlue = ImageIO.read(getClass().getResourceAsStream("/res/blue_dragon22.png"));

			thirdBlue = ImageIO.read(getClass().getResourceAsStream("/res/blue_dragon23.png"));

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

		if (gp.monsterLevel == 0) {
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
		} else if (gp.monsterLevel == 1) {
			switch (gp.countLoop) {
			case 0, 1, 2, 3:
				image = firstYellow;
				break;
			case 4, 5, 6, 7:
				image = secondYellow;
				break;
			case 8, 9, 10, 11:
				image = thirdYellow;
				break;
			case 12, 13, 14, 15:
				image = secondYellow;
			default:
				image = image;
				break;
			}
		}else if (gp.monsterLevel == 2) {
			switch (gp.countLoop) {
			case 0, 1, 2, 3:
				image = firstBlue;
				break;
			case 4, 5, 6, 7:
				image = secondBlue;
				break;
			case 8, 9, 10, 11:
				image = thirdBlue;
				break;
			case 12, 13, 14, 15:
				image = secondBlue;
			default:
				image = image;
				break;
			}
		}

		g2.drawImage(image, x, y, gp.tileSize * 2, gp.tileSize, null);
	}

	public void move(double destinationPosionX, int yy) { // move monster slowly to the determined point
		if (x == destinationPosionX && y == yy)
			return;
		else {
			if (x < destinationPosionX) {
				x += speed;
			} else if (x > destinationPosionX) {
				x -= speed;
			}

			if (y < yy) {
				y += speed;
			} else if (y > yy) {
				y -= speed;
			}
		}
	}

}
