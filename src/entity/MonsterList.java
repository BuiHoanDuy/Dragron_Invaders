package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import main.GamePanel;

public class MonsterList {
	GamePanel gp;
	ArrayList<Monster> monster;
	ArrayList<Bullet> monsterBulletList;

	public MonsterList(GamePanel gp) {
		this.gp = gp;
		monster = new ArrayList<Monster>();
		monsterBulletList = new ArrayList<Bullet>();

	}

	public void round1Set() { // cài đặt các vị trí mặc định cho các con Dragon
		// trừ đi 24px để căn đều 2 bên
		gp.playSE(2);
		
		monster.add(new Monster(gp, 48 - 24, 0, 3));
		monster.add(new Monster(gp, 144 - 24, 0, 3));
		monster.add(new Monster(gp, 240 - 24, 0, 3));
		monster.add(new Monster(gp, 336 - 24, 0, 3));
		monster.add(new Monster(gp, 432 - 24, 0, 3));
		monster.add(new Monster(gp, 528 - 24, 0, 3));
		monster.add(new Monster(gp, 624 - 24, 0, 3));
		monster.add(new Monster(gp, 720 - 24, 0, 3));
		monster.add(new Monster(gp, 816 - 24, 0, 3));
		monster.add(new Monster(gp, 912 - 24, 0, 3));

		monster.add(new Monster(gp, 48 - 24, 48, 3));
		monster.add(new Monster(gp, 144 - 24, 48, 3));
		monster.add(new Monster(gp, 240 - 24, 48, 3));
		monster.add(new Monster(gp, 336 - 24, 48, 3));
		monster.add(new Monster(gp, 432 - 24, 48, 3));
		monster.add(new Monster(gp, 528 - 24, 48, 3));
		monster.add(new Monster(gp, 624 - 24, 48, 3));
		monster.add(new Monster(gp, 720 - 24, 48, 3));
		monster.add(new Monster(gp, 816 - 24, 48, 3));
		monster.add(new Monster(gp, 912 - 24, 48, 3));

		monster.add(new Monster(gp, 48 - 24, 96, 3));
		monster.add(new Monster(gp, 144 - 24, 96, 3));
		monster.add(new Monster(gp, 240 - 24, 96, 3));
		monster.add(new Monster(gp, 336 - 24, 96, 3));
		monster.add(new Monster(gp, 432 - 24, 96, 3));
		monster.add(new Monster(gp, 528 - 24, 96, 3));
		monster.add(new Monster(gp, 624 - 24, 96, 3));
		monster.add(new Monster(gp, 720 - 24, 96, 3));
		monster.add(new Monster(gp, 816 - 24, 96, 3));
		monster.add(new Monster(gp, 912 - 24, 96, 3));
	}

	// round2Update, round3Update, ... complete in the future
	public void movementUpdate() { // update position of monsterList
		int percentageOfMonsterBullet;

		for (int i = 0; i < monster.size(); i++) {
			// move monster
			monster.get(i).move(monster.get(i).destinationPosionX, monster.get(i).destinationPosionY);
		}

	}

	public void checkDeath() {
		// check Death
		for (int i = monster.size()-1; i >= 0; i--) {
			for (int j = 0; j < gp.bulletList.bullet.size(); j++) {
				if (monster.get(i).x <= gp.bulletList.bullet.get(j).x
						&& monster.get(i).x + 80 >= gp.bulletList.bullet.get(j).x
						&& monster.get(i).y + 48 >= gp.bulletList.bullet.get(j).y 
						&& monster.get(i).y <= gp.bulletList.bullet.get(j).y+20) {
					monster.get(i).lifes--;
					//gp.playSE(5);
					gp.bulletList.bullet.remove(j);
					
					//Delete monsster
					if (monster.get(i).lifes == 0) {
						monster.remove(i);
						gp.playSE(1);
					}
				}
			}
		}
	}

	public void update(int round) { // truyền round số mấy vào để update cho phù hợp, sử dụng If else;
		movementUpdate();
		if (gp.countLoop > 10) {
			gp.countLoop = 0;
		}
		try {
			checkDeath();		
		} catch (Exception e) {
		}
		
		if (gp.monsterList.monster.size() == 0) {
			gp.playSE(4);
			round1Set();
		}
	}

	public void draw(Graphics2D g2) {

		for (int i = 0; i < monster.size(); i++) {
			monster.get(i).draw(g2);
		}
	}
}
