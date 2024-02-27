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
		bullet.add(new Bullet(gp, gp.player.x  + 37, -50)); // cộng 37 để đạn trôi vào chính giữa của máy bay
	}
	
	public void update() { // update position of monsterList
		if (gp.countLoop == 5) {
			createBulletList();			
		}
		for (int i = 0; i < bullet.size(); i++) {
			bullet.get(i).move(bullet.get(i).destinationPosionX, bullet.get(i).destinationPosionY);
			if (bullet.get(i).x == 0) {
				bullet.remove(i);
			}
		}
		
	}


	public void draw(Graphics2D g2) {
		for (int i = 0; i < bullet.size(); i++) {
			bullet.get(i).draw(g2);
		}

	}
}
