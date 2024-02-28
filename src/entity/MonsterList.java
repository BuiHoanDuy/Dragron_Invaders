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

		round1Set();
	}

	public void round1Set() { // cài đặt các vị trí mặc định cho các con Dragon
		// trừ đi 24px để căn đều 2 bên

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
	public void round1Update() { // update position of monsterList
		int percentageOfMonsterBullet;

		for (int i = 0; i < monster.size(); i++) {

			monster.get(i).move(monster.get(i).destinationPosionX, monster.get(i).destinationPosionY);
		}
		
	}

	public void update(int round) { // truyền round số mấy vào để update cho phù hợp, sử dụng If else;
		if (round == 1) {
			round1Update();
		}
		if (gp.countLoop > 10) {
			gp.countLoop = 0;
		}
	}

	public void draw(Graphics2D g2) {

		for (int i = 0; i < monster.size(); i++) {
			monster.get(i).draw(g2);
		}
		
	}
}
