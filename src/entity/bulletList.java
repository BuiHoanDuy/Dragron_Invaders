package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;

import main.GamePanel;

public class bulletList {
	GamePanel gp;
	ArrayList<Bullet> bullet;

	public bulletList(GamePanel gp) {
		this.gp = gp;
		bullet = new ArrayList<Bullet>();

	}

	public void createBulletList() {
		if (gp.ultiFlag == true) {
			bullet.add(new Bullet(gp, gp.player.x - 10, -50, gp.player.x - 10, gp.player.y, 8));
			bullet.add(new Bullet(gp, gp.player.x - 10 + 48, -50, gp.player.x - 10 + 48, gp.player.y, 6));
			bullet.add(new Bullet(gp, gp.player.x - 10 + 96, -50, gp.player.x - 10 + 96, gp.player.y, 6));
		} else {
			if (gp.bulletLevel == 1) {
				bullet.add(new Bullet(gp, gp.player.x + 37, -50, 6)); // cộng 37 để đạn trôi vào chính giữa của máy bay
			} else if (gp.bulletLevel == 2) {
				bullet.add(new Bullet(gp, gp.player.x + 37, -50, 8));
			} else if (gp.bulletLevel == 3) {
				bullet.add(new Bullet(gp, gp.player.x + 50, -50, gp.player.x + 50, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x + 20, -50, gp.player.x + 20, gp.player.y, 8));
			} else if (gp.bulletLevel == 4) {
				bullet.add(new Bullet(gp, gp.player.x - 10, -50, gp.player.x - 10, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 48, -50, gp.player.x - 10 + 48, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 96, -50, gp.player.x - 10 + 96, gp.player.y, 8));
			} else if (gp.bulletLevel == 5) {
				bullet.add(new Bullet(gp, (gp.player.x + 37) + gp.player.y * Math.tan(0.3), -50, 8));
				bullet.add(new Bullet(gp, gp.player.x + 37, -50, 8));
				bullet.add(new Bullet(gp, (gp.player.x + 37) + gp.player.y * -Math.tan(0.3), -50, 8));
			} else if (gp.bulletLevel == 6) {
				bullet.add(new Bullet(gp, (gp.player.x + 37) + gp.player.y * Math.tan(0.3), -50, 10));
				bullet.add(new Bullet(gp, gp.player.x + 37, -50, 10));
				bullet.add(new Bullet(gp, (gp.player.x + 37) + gp.player.y * -Math.tan(0.3), -50, 10));
			} else if (gp.bulletLevel == 7) {
				// win ball
				bullet.add(new Bullet(gp, gp.player.x - 10, -50, gp.player.x - 10, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 48, -50, gp.player.x - 10 + 48, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 96, -50, gp.player.x - 10 + 96, gp.player.y, 8));
			} else if (gp.bulletLevel == 8) {
				bullet.add(new Bullet(gp, (gp.player.x + 37) + gp.player.y * Math.tan(0.3), -50, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10, -50, gp.player.x - 10, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 48, -50, gp.player.x - 10 + 48, gp.player.y, 8));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 96, -50, gp.player.x - 10 + 96, gp.player.y, 8));
				bullet.add(new Bullet(gp, (gp.player.x + 37) + gp.player.y * -Math.tan(0.3), -50, 8));
			} else if (gp.bulletLevel >= 9) {
				bullet.add(new Bullet(gp, gp.player.x - 30, -50, gp.player.x - 10, gp.player.y, 4));
				bullet.add(new Bullet(gp, gp.player.x, -50, gp.player.x - 10, gp.player.y, 4));
				bullet.add(new Bullet(gp, gp.player.x + 24, -50, gp.player.x - 10 + 48, gp.player.y, 4));
				bullet.add(new Bullet(gp, gp.player.x + 55, -50, gp.player.x - 10 + 96, gp.player.y, 4));
				bullet.add(new Bullet(gp, gp.player.x - 10 + 96, -50, gp.player.x - 10 + 96, gp.player.y, 4));
			}
		}
	}

	public void update() { // update position of monsterList
		if (gp.countLoop == 5) {
			createBulletList();
		}

		for (int i = 0; i < bullet.size(); i++) {
			bullet.get(i).move(bullet.get(i).destinationPosionX, bullet.get(i).destinationPosionY);
			if (bullet.get(i).y < -20) {
				bullet.remove(i);
			}
			
		}

	}

	public void draw(Graphics2D g2) {

		if (gp.ultiFlag == true) {
			for (int i = 0; i < bullet.size(); i++) {
				bullet.get(i).drawFireBall(g2);
			}
		} else {
			if (gp.bulletLevel < 7) {
				for (int i = 0; i < bullet.size(); i++) {
					bullet.get(i).draw(g2);
				}
			} else if (gp.bulletLevel >= 7) {
				for (int i = 0; i < bullet.size(); i++) {
					bullet.get(i).drawWindBall(g2);
					
					// prevent bulletLevel is over 9
					if (gp.bulletLevel > 9) gp.bulletLevel = 9;
				}
			} else {
				for (int i = 0; i < bullet.size(); i++) {
					bullet.get(i).draw(g2);
				}
			}
		}
	}
}
