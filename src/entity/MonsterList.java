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

	public void roundSet(int round) {
		switch (round) {
		case 1:
			round1Set();
			break;
		case 2:
			round2Set();
			break;
		case 3:
			round3Set();
			break;
		case 4:
			round4Set();
			break;
		case 5:
			round5Set();
			break;
		case 6:
			round6Set();
			break;
		case 7:
			round7Set();
			break;
		case 8:
			round8Set();
			break;
		case 9:
			round9Set();
			break;
		case 10:
			round10Set();
			break;
		case 11:
			round11Set();
			break;
		case 12:
			round12Set();
			break;
		case 13:
			round13Set();
			break;
		}
	}

	public void round1Set() { // cài đặt các vị trí mặc định cho các con Dragon
		// trừ đi 24px để căn đều 2 bên
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 1));
		monster.add(new Monster(gp, 480, 0, 1));
		monster.add(new Monster(gp, 864, 0, 1));
	}
	public void round2Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 1));
		monster.add(new Monster(gp, 240, 0, 1));
		monster.add(new Monster(gp, 480, 0, 1));
		monster.add(new Monster(gp, 672, 0, 1));
		monster.add(new Monster(gp, 864, 0, 1));
	}
	public void round3Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 1));
		monster.add(new Monster(gp, 240, 0, 1));
		monster.add(new Monster(gp, 480, 0, 1));
		monster.add(new Monster(gp, 672, 0, 1));
		monster.add(new Monster(gp, 864, 0, 1));
		
		monster.add(new Monster(gp, 144, 48, 1));
		monster.add(new Monster(gp, 336, 48, 1));
		monster.add(new Monster(gp, 576, 48, 1));
		monster.add(new Monster(gp, 768, 48, 1));
	}
	public void round4Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 2));
		monster.add(new Monster(gp, 240, 0, 2));
		monster.add(new Monster(gp, 480, 0, 2));
		monster.add(new Monster(gp, 672, 0, 2));
		monster.add(new Monster(gp, 864, 0, 2));
		
		monster.add(new Monster(gp, 144, 48, 2));
		monster.add(new Monster(gp, 336, 48, 2));
		monster.add(new Monster(gp, 576, 48, 2));
		monster.add(new Monster(gp, 768, 48, 2));
		
		monster.add(new Monster(gp, 48, 96, 2));
		monster.add(new Monster(gp, 240, 96, 2));
		monster.add(new Monster(gp, 480, 96, 2));
		monster.add(new Monster(gp, 672, 96, 2));
		monster.add(new Monster(gp, 864, 96, 2));
		
	}
	
	public void round5Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 2));
		monster.add(new Monster(gp, 240, 0, 2));
		monster.add(new Monster(gp, 480, 0, 2));
		monster.add(new Monster(gp, 672, 0, 2));
		monster.add(new Monster(gp, 864, 0, 2));
		monster.add(new Monster(gp, 144, 0, 2));
		monster.add(new Monster(gp, 336, 0, 2));
		monster.add(new Monster(gp, 576, 0, 2));
		monster.add(new Monster(gp, 768, 0, 2));
		
		monster.add(new Monster(gp, 144, 48, 2));
		monster.add(new Monster(gp, 336, 48, 2));
		monster.add(new Monster(gp, 576, 48, 2));
		monster.add(new Monster(gp, 768, 48, 2));
		
		monster.add(new Monster(gp, 48, 96, 2));
		monster.add(new Monster(gp, 240, 96, 2));
		monster.add(new Monster(gp, 480, 96, 2));
		monster.add(new Monster(gp, 672, 96, 2));
		monster.add(new Monster(gp, 864, 96, 2));
		
	}
	
	public void round6Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 2));
		monster.add(new Monster(gp, 240, 0, 2));
		monster.add(new Monster(gp, 480, 0, 2));
		monster.add(new Monster(gp, 672, 0, 2));
		monster.add(new Monster(gp, 864, 0, 2));
		monster.add(new Monster(gp, 144, 0, 2));
		monster.add(new Monster(gp, 336, 0, 2));
		monster.add(new Monster(gp, 576, 0, 2));
		monster.add(new Monster(gp, 768, 0, 2));
		
		monster.add(new Monster(gp, 144, 48, 2));
		monster.add(new Monster(gp, 336, 48, 2));
		monster.add(new Monster(gp, 576, 48, 2));
		monster.add(new Monster(gp, 768, 48, 2));
		monster.add(new Monster(gp, 48, 48, 2));
		monster.add(new Monster(gp, 240, 48, 2));
		monster.add(new Monster(gp, 480, 48, 2));
		monster.add(new Monster(gp, 672, 48, 2));
		monster.add(new Monster(gp, 864, 48, 2));
		
		monster.add(new Monster(gp, 48, 96, 2));
		monster.add(new Monster(gp, 240, 96, 2));
		monster.add(new Monster(gp, 480, 96, 2));
		monster.add(new Monster(gp, 672, 96, 2));
		monster.add(new Monster(gp, 864, 96, 2));
		
	}
	public void round7Set() {
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

	public void round8Set() {
		gp.playSE(2);
		
		// levvel up for Monster
		gp.setValueForMonster(1, 6, 3);
		
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
	}
	
	public void round9Set() {
		gp.playSE(2);
		
		gp.setValueForMonster(1, 6, 3);

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
	}
	
	public void round10Set() {
		gp.playSE(2);

		gp.setValueForMonster(1, 6, 3);
		
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
	
	public void round11Set() {
		gp.playSE(2);
		
		gp.setValueForMonster(2, 7, 2);
		
		monster.add(new Monster(gp, 48, 0, 3));
		monster.add(new Monster(gp, 240, 0, 3));
		monster.add(new Monster(gp, 480, 0, 3));
		monster.add(new Monster(gp, 672, 0, 3));
		monster.add(new Monster(gp, 864, 0, 3));
		
		monster.add(new Monster(gp, 144, 48, 3));
		monster.add(new Monster(gp, 336, 48, 3));
		monster.add(new Monster(gp, 576, 48, 3));
		monster.add(new Monster(gp, 768, 48, 3));
	}
	
	public void round12Set() {
		gp.playSE(2);
		gp.setValueForMonster(2, 7, 2);

		monster.add(new Monster(gp, 48, 0, 3));
		monster.add(new Monster(gp, 240, 0, 3));
		monster.add(new Monster(gp, 480, 0, 3));
		monster.add(new Monster(gp, 672, 0, 3));
		monster.add(new Monster(gp, 864, 0, 3));
		monster.add(new Monster(gp, 144, 0, 3));
		monster.add(new Monster(gp, 336, 0, 3));
		monster.add(new Monster(gp, 576, 0, 3));
		monster.add(new Monster(gp, 768, 0, 3));
		
		monster.add(new Monster(gp, 144, 48, 3));
		monster.add(new Monster(gp, 336, 48, 3));
		monster.add(new Monster(gp, 576, 48, 3));
		monster.add(new Monster(gp, 768, 48, 3));
		monster.add(new Monster(gp, 48, 48, 3));
		monster.add(new Monster(gp, 240, 48, 3));
		monster.add(new Monster(gp, 480, 48, 3));
		monster.add(new Monster(gp, 672, 48, 3));
		monster.add(new Monster(gp, 864, 48, 3));
		
		monster.add(new Monster(gp, 48, 96, 3));
		monster.add(new Monster(gp, 240, 96, 3));
		monster.add(new Monster(gp, 480, 96, 3));
		monster.add(new Monster(gp, 672, 96, 3));
		monster.add(new Monster(gp, 864, 96, 3));
	}
	
	public void round13Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 7, 2);
		
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
	public void movementUpdate() { // update position of monsterList
		int percentageOfMonsterBullet;

		for (int i = 0; i < monster.size(); i++) {
			// move monster
			monster.get(i).move(monster.get(i).destinationPosionX, monster.get(i).destinationPosionY);
		}

	}

	public void checkDeath() {
		// check Death
		for (int i = monster.size() - 1; i >= 0; i--) {
			for (int j = 0; j < gp.bulletList.bullet.size(); j++) {
				if (monster.get(i).x <= gp.bulletList.bullet.get(j).x
						&& monster.get(i).x + 80 >= gp.bulletList.bullet.get(j).x
						&& monster.get(i).y + 48 >= gp.bulletList.bullet.get(j).y
						&& monster.get(i).y <= gp.bulletList.bullet.get(j).y + 20) {
					monster.get(i).lifes--;
					// gp.playSE(5);
					gp.bulletList.bullet.remove(j);

					// Delete monsster
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
		// count for Player's Bullet:
		if (gp.countLoop > 10) {
			gp.countLoop = 0;
		}

		try {
			checkDeath();
		} catch (Exception e) {
		}

		// when monsterList is NULL:
		if (gp.monsterList.monster.size() == 0) {
			roundSet(round);
			gp.playSE(4); // levelUp sound
			// tạo ra hàm RoundSet(int round), trong hàm RoundSet thì đưa các hàm vẽ Map
			// vào.
			gp.round++; // Increase roundLevel
		}
	}

	public void draw(Graphics2D g2) {

		for (int i = 0; i < monster.size(); i++) {
			monster.get(i).draw(g2);
		}
	}
}
