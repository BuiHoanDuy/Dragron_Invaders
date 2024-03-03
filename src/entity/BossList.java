package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;

import main.GamePanel;

public class BossList {
	GamePanel gp;
	ArrayList<Boss> boss;

	public BossList(GamePanel gp) {
		this.gp = gp;
		boss = new ArrayList<Boss>();
	}
	
	public void movementUpdate() { // update position of monsterList
		for (int i = 0; i < boss.size(); i++) {
			// move monster
			boss.get(i).move(boss.get(i).destinationPosionX, boss.get(i).destinationPosionY);
		}
	}

	public void checkDeath() {
		// check Death
		for (int i = boss.size() - 1; i >= 0; i--) {
			for (int j = 0; j < gp.bulletList.bullet.size(); j++) {
				if (boss.get(i).x <= gp.bulletList.bullet.get(j).x
						&& boss.get(i).x + 48*6 >= gp.bulletList.bullet.get(j).x
						&& boss.get(i).y + 48*3 >= gp.bulletList.bullet.get(j).y
						&& boss.get(i).y <= gp.bulletList.bullet.get(j).y + 20) {
					boss.get(i).lifes--;
					// gp.playSE(5);

					// Cài Ulti bắn xuyên đoọi hình địch
					if (gp.ultiFlag == false)
						gp.bulletList.bullet.remove(j);

					// Delete monster
					if (boss.get(i).lifes == 0) {
						boss.remove(i);
						gp.playSE(1);
						gp.round++;
					}
				}
			}
		}
	}

	public void update() { // truyền round số mấy vào để update cho phù hợp, sử dụng If else;
		movementUpdate();
		// count for Player's Bullet:
		if (gp.countLoop > 10) {
			gp.countLoop = 0;
		}

		try {
			checkDeath();
		} catch (Exception e) {
		}

		// when monsterList is NULL:
	}

	public void draw(Graphics2D g2) {

		for (int i = 0; i < boss.size(); i++) {
			boss.get(i).draw(g2);
		}
	}
}
