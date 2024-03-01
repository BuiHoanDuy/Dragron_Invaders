package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import main.GamePanel;

public class RedItem extends Item{
	public RedItem(GamePanel gp) {
		this.gp = gp;
	}

	GamePanel gp;
	
	public RedItem( GamePanel gp, int x, int y, int desX, int desY) {
		this.gp = gp;
		this.x = x; this.y = y;
		this.destinationX = desX; this.destinationY = desY;
		this.speed = 4;
		
		getImage("/res/Boss_BulletUpgrade/Red_Bullet_Uprade.png");
	}
	
	public void draw(Graphics2D g2) {

		BufferedImage image = ItemImage;

		g2.drawImage(image, x , y, gp.tileSize , gp.tileSize, null);
	}
}
