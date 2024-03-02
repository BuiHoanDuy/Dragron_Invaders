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
		case 14:
			round14Set();
			break;
		case 15:
			round15Set();
			break;
		case 16:
			round16Set();
			break;
		case 17:
			round17Set();
			break;
		case 18:
			round18Set();
			break;
		case 19:
			round19Set();
			break;
		case 20:
			round20Set();
			break;
		case 21:
			round21Set();
			break;
		case 22:
			round22Set();
			break;
		case 23:
			// round23Set();
			break;
		}
	}

	public void round1Set() { // cài đặt các vị trí mặc định cho các con Dragon
		// trừ đi 24px để căn đều 2 bên
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 2));
		monster.add(new Monster(gp, 480, 0, 2));
		monster.add(new Monster(gp, 864, 0, 2));
	}

	public void round2Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 2));
		monster.add(new Monster(gp, 240, 0, 2));
		monster.add(new Monster(gp, 480, 0, 2));
		monster.add(new Monster(gp, 672, 0, 2));
		monster.add(new Monster(gp, 864, 0, 2));
	}

	public void round3Set() {
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
	}

	public void round4Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48, 0, 3));
		monster.add(new Monster(gp, 240, 0, 3));
		monster.add(new Monster(gp, 480, 0, 3));
		monster.add(new Monster(gp, 672, 0, 3));
		monster.add(new Monster(gp, 864, 0, 3));

		monster.add(new Monster(gp, 144, 48, 3));
		monster.add(new Monster(gp, 336, 48, 3));
		monster.add(new Monster(gp, 576, 48, 3));
		monster.add(new Monster(gp, 768, 48, 3));

		monster.add(new Monster(gp, 48, 96, 3));
		monster.add(new Monster(gp, 240, 96, 3));
		monster.add(new Monster(gp, 480, 96, 3));
		monster.add(new Monster(gp, 672, 96, 3));
		monster.add(new Monster(gp, 864, 96, 3));

	}

	public void round5Set() {
		gp.playSE(2);

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

		monster.add(new Monster(gp, 48, 96, 3));
		monster.add(new Monster(gp, 240, 96, 3));
		monster.add(new Monster(gp, 480, 96, 3));
		monster.add(new Monster(gp, 672, 96, 3));
		monster.add(new Monster(gp, 864, 96, 3));

	}

	public void round6Set() {
		gp.playSE(2);

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

	public void round7Set() {
		gp.playSE(2);

		monster.add(new Monster(gp, 48 - 24, 0, 5));
		monster.add(new Monster(gp, 144 - 24, 0, 5));
		monster.add(new Monster(gp, 240 - 24, 0, 5));
		monster.add(new Monster(gp, 336 - 24, 0, 5));
		monster.add(new Monster(gp, 432 - 24, 0, 5));
		monster.add(new Monster(gp, 528 - 24, 0, 5));
		monster.add(new Monster(gp, 624 - 24, 0, 5));
		monster.add(new Monster(gp, 720 - 24, 0, 5));
		monster.add(new Monster(gp, 816 - 24, 0, 5));
		monster.add(new Monster(gp, 912 - 24, 0, 5));

		monster.add(new Monster(gp, 48 - 24, 48, 5));
		monster.add(new Monster(gp, 144 - 24, 48, 5));
		monster.add(new Monster(gp, 240 - 24, 48, 5));
		monster.add(new Monster(gp, 336 - 24, 48, 5));
		monster.add(new Monster(gp, 432 - 24, 48, 5));
		monster.add(new Monster(gp, 528 - 24, 48, 5));
		monster.add(new Monster(gp, 624 - 24, 48, 5));
		monster.add(new Monster(gp, 720 - 24, 48, 5));
		monster.add(new Monster(gp, 816 - 24, 48, 5));
		monster.add(new Monster(gp, 912 - 24, 48, 5));

		monster.add(new Monster(gp, 48 - 24, 96, 5));
		monster.add(new Monster(gp, 144 - 24, 96, 5));
		monster.add(new Monster(gp, 240 - 24, 96, 5));
		monster.add(new Monster(gp, 336 - 24, 96, 5));
		monster.add(new Monster(gp, 432 - 24, 96, 5));
		monster.add(new Monster(gp, 528 - 24, 96, 5));
		monster.add(new Monster(gp, 624 - 24, 96, 5));
		monster.add(new Monster(gp, 720 - 24, 96, 5));
		monster.add(new Monster(gp, 816 - 24, 96, 5));
		monster.add(new Monster(gp, 912 - 24, 96, 5));
	}

	public void round8Set() {
		gp.playSE(2);

		// levvel up for Monster
		gp.setValueForMonster(1, 6, 3);

		monster.add(new Monster(gp, 48 - 24, 0, 7));
		monster.add(new Monster(gp, 144 - 24, 0, 7));
		monster.add(new Monster(gp, 240 - 24, 0, 7));
		monster.add(new Monster(gp, 336 - 24, 0, 7));
		monster.add(new Monster(gp, 432 - 24, 0, 7));
		monster.add(new Monster(gp, 528 - 24, 0, 7));
		monster.add(new Monster(gp, 624 - 24, 0, 7));
		monster.add(new Monster(gp, 720 - 24, 0, 7));
		monster.add(new Monster(gp, 816 - 24, 0, 7));
		monster.add(new Monster(gp, 912 - 24, 0, 7));
	}

	public void round9Set() {
		gp.playSE(2);

		gp.setValueForMonster(1, 6, 3);

		monster.add(new Monster(gp, 48 - 24, 0, 7));
		monster.add(new Monster(gp, 144 - 24, 0, 7));
		monster.add(new Monster(gp, 240 - 24, 0, 7));
		monster.add(new Monster(gp, 336 - 24, 0, 7));
		monster.add(new Monster(gp, 432 - 24, 0, 7));
		monster.add(new Monster(gp, 528 - 24, 0, 7));
		monster.add(new Monster(gp, 624 - 24, 0, 7));
		monster.add(new Monster(gp, 720 - 24, 0, 7));
		monster.add(new Monster(gp, 816 - 24, 0, 7));
		monster.add(new Monster(gp, 912 - 24, 0, 7));

		monster.add(new Monster(gp, 48 - 24, 48, 7));
		monster.add(new Monster(gp, 144 - 24, 48, 7));
		monster.add(new Monster(gp, 240 - 24, 48, 7));
		monster.add(new Monster(gp, 336 - 24, 48, 7));
		monster.add(new Monster(gp, 432 - 24, 48, 7));
		monster.add(new Monster(gp, 528 - 24, 48, 7));
		monster.add(new Monster(gp, 624 - 24, 48, 7));
		monster.add(new Monster(gp, 720 - 24, 48, 7));
		monster.add(new Monster(gp, 816 - 24, 48, 7));
		monster.add(new Monster(gp, 912 - 24, 48, 7));
	}

	public void round10Set() {
		gp.playSE(2);

		gp.setValueForMonster(1, 6, 3);

		monster.add(new Monster(gp, 48 - 24, 0, 7));
		monster.add(new Monster(gp, 144 - 24, 0, 7));
		monster.add(new Monster(gp, 240 - 24, 0, 7));
		monster.add(new Monster(gp, 336 - 24, 0, 7));
		monster.add(new Monster(gp, 432 - 24, 0, 7));
		monster.add(new Monster(gp, 528 - 24, 0, 7));
		monster.add(new Monster(gp, 624 - 24, 0, 7));
		monster.add(new Monster(gp, 720 - 24, 0, 7));
		monster.add(new Monster(gp, 816 - 24, 0, 7));
		monster.add(new Monster(gp, 912 - 24, 0, 7));

		monster.add(new Monster(gp, 48 - 24, 48, 7));
		monster.add(new Monster(gp, 144 - 24, 48, 7));
		monster.add(new Monster(gp, 240 - 24, 48, 7));
		monster.add(new Monster(gp, 336 - 24, 48, 7));
		monster.add(new Monster(gp, 432 - 24, 48, 7));
		monster.add(new Monster(gp, 528 - 24, 48, 7));
		monster.add(new Monster(gp, 624 - 24, 48, 7));
		monster.add(new Monster(gp, 720 - 24, 48, 7));
		monster.add(new Monster(gp, 816 - 24, 48, 7));
		monster.add(new Monster(gp, 912 - 24, 48, 7));

		monster.add(new Monster(gp, 48 - 24, 96, 7));
		monster.add(new Monster(gp, 144 - 24, 96, 7));
		monster.add(new Monster(gp, 240 - 24, 96, 7));
		monster.add(new Monster(gp, 336 - 24, 96, 7));
		monster.add(new Monster(gp, 432 - 24, 96, 7));
		monster.add(new Monster(gp, 528 - 24, 96, 7));
		monster.add(new Monster(gp, 624 - 24, 96, 7));
		monster.add(new Monster(gp, 720 - 24, 96, 7));
		monster.add(new Monster(gp, 816 - 24, 96, 7));
		monster.add(new Monster(gp, 912 - 24, 96, 7));
	}

	public void round11Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 7, 2);

		monster.add(new Monster(gp, 48, 0, 10));
		monster.add(new Monster(gp, 240, 0, 10));
		monster.add(new Monster(gp, 480, 0, 10));
		monster.add(new Monster(gp, 672, 0, 10));
		monster.add(new Monster(gp, 864, 0, 10));

		monster.add(new Monster(gp, 144, 48, 10));
		monster.add(new Monster(gp, 336, 48, 10));
		monster.add(new Monster(gp, 576, 48, 10));
		monster.add(new Monster(gp, 768, 48, 10));
	}

	public void round12Set() {
		gp.playSE(2);
		gp.setValueForMonster(2, 7, 2);

		monster.add(new Monster(gp, 48, 0, 10));
		monster.add(new Monster(gp, 240, 0, 10));
		monster.add(new Monster(gp, 480, 0, 10));
		monster.add(new Monster(gp, 672, 0, 10));
		monster.add(new Monster(gp, 864, 0, 10));
		monster.add(new Monster(gp, 144, 0, 10));
		monster.add(new Monster(gp, 336, 0, 10));
		monster.add(new Monster(gp, 576, 0, 10));
		monster.add(new Monster(gp, 768, 0, 10));

		monster.add(new Monster(gp, 144, 48, 10));
		monster.add(new Monster(gp, 336, 48, 10));
		monster.add(new Monster(gp, 576, 48, 10));
		monster.add(new Monster(gp, 768, 48, 10));
		monster.add(new Monster(gp, 48, 48, 10));
		monster.add(new Monster(gp, 240, 48, 10));
		monster.add(new Monster(gp, 480, 48, 10));
		monster.add(new Monster(gp, 672, 48, 10));
		monster.add(new Monster(gp, 864, 48, 10));

		monster.add(new Monster(gp, 48, 96, 10));
		monster.add(new Monster(gp, 240, 96, 10));
		monster.add(new Monster(gp, 480, 96, 10));
		monster.add(new Monster(gp, 672, 96, 10));
		monster.add(new Monster(gp, 864, 96, 10));
	}

	public void round13Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 7, 2);

		monster.add(new Monster(gp, 48 - 24, 0, 10));
		monster.add(new Monster(gp, 144 - 24, 0, 10));
		monster.add(new Monster(gp, 240 - 24, 0, 10));
		monster.add(new Monster(gp, 336 - 24, 0, 10));
		monster.add(new Monster(gp, 432 - 24, 0, 10));
		monster.add(new Monster(gp, 528 - 24, 0, 10));
		monster.add(new Monster(gp, 624 - 24, 0, 10));
		monster.add(new Monster(gp, 720 - 24, 0, 10));
		monster.add(new Monster(gp, 816 - 24, 0, 10));
		monster.add(new Monster(gp, 912 - 24, 0, 10));

		monster.add(new Monster(gp, 48 - 24, 48, 10));
		monster.add(new Monster(gp, 144 - 24, 48, 10));
		monster.add(new Monster(gp, 240 - 24, 48, 10));
		monster.add(new Monster(gp, 336 - 24, 48, 10));
		monster.add(new Monster(gp, 432 - 24, 48, 10));
		monster.add(new Monster(gp, 528 - 24, 48, 10));
		monster.add(new Monster(gp, 624 - 24, 48, 10));
		monster.add(new Monster(gp, 720 - 24, 48, 10));
		monster.add(new Monster(gp, 816 - 24, 48, 10));
		monster.add(new Monster(gp, 912 - 24, 48, 10));

		monster.add(new Monster(gp, 48 - 24, 96, 10));
		monster.add(new Monster(gp, 144 - 24, 96, 10));
		monster.add(new Monster(gp, 240 - 24, 96, 10));
		monster.add(new Monster(gp, 336 - 24, 96, 10));
		monster.add(new Monster(gp, 432 - 24, 96, 10));
		monster.add(new Monster(gp, 528 - 24, 96, 10));
		monster.add(new Monster(gp, 624 - 24, 96, 10));
		monster.add(new Monster(gp, 720 - 24, 96, 10));
		monster.add(new Monster(gp, 816 - 24, 96, 10));
		monster.add(new Monster(gp, 912 - 24, 96, 10));
	}

	// add BOSS LEVEL IN ROUND 14
	public void round14Set() {
		if (gp.bossFlag == false) {
			gp.bossLevel = 0;
			gp.playSE(2);
			gp.bossList.boss.add(new Boss(gp, 364, 48, 100));
			gp.bossFlag = true;
		}
	}

	public void round15Set() {
		gp.bossFlag = false;

		gp.playSE(2);

		gp.setValueForMonster(0, 8, 2);

		monster.add(new Monster(gp, 240, 48, 20));
		monster.add(new Monster(gp, 672, 48, 20));

	}

	public void round16Set() {

		gp.playSE(2);

		gp.setValueForMonster(1, 8, 2);

		monster.add(new Monster(gp, 240, 48, 30));
		monster.add(new Monster(gp, 672, 48, 30));
	}

	public void round17Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 8, 2);

		monster.add(new Monster(gp, 240, 48, 50));
		monster.add(new Monster(gp, 672, 48, 50));
	}

	public void round18Set() {
		gp.playSE(2);

		gp.setValueForMonster(1, 8, 2);

		monster.add(new Monster(gp, 48, 0, 20));
		monster.add(new Monster(gp, 240, 0, 20));
		monster.add(new Monster(gp, 480, 0, 20));
		monster.add(new Monster(gp, 672, 0, 20));
		monster.add(new Monster(gp, 864, 0, 20));
	}

	public void round19Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 8, 2);

		monster.add(new Monster(gp, 48, 0, 20));
		monster.add(new Monster(gp, 240, 0, 20));
		monster.add(new Monster(gp, 480, 0, 20));
		monster.add(new Monster(gp, 672, 0, 20));
		monster.add(new Monster(gp, 864, 0, 20));

		monster.add(new Monster(gp, 144, 48, 20));
		monster.add(new Monster(gp, 336, 48, 20));
		monster.add(new Monster(gp, 576, 48, 20));
		monster.add(new Monster(gp, 768, 48, 20));

		monster.add(new Monster(gp, 48, 96, 20));
		monster.add(new Monster(gp, 240, 96, 20));
		monster.add(new Monster(gp, 480, 96, 20));
		monster.add(new Monster(gp, 672, 96, 20));
		monster.add(new Monster(gp, 864, 96, 20));
	}

	public void round20Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 8, 2);

		monster.add(new Monster(gp, 48, 0, 20));
		monster.add(new Monster(gp, 240, 0, 20));
		monster.add(new Monster(gp, 480, 0, 20));
		monster.add(new Monster(gp, 672, 0, 20));
		monster.add(new Monster(gp, 864, 0, 20));
		monster.add(new Monster(gp, 144, 0, 20));
		monster.add(new Monster(gp, 336, 0, 20));
		monster.add(new Monster(gp, 576, 0, 20));
		monster.add(new Monster(gp, 768, 0, 20));

		monster.add(new Monster(gp, 144, 48, 20));
		monster.add(new Monster(gp, 336, 48, 20));
		monster.add(new Monster(gp, 576, 48, 20));
		monster.add(new Monster(gp, 768, 48, 20));

		monster.add(new Monster(gp, 48, 96, 20));
		monster.add(new Monster(gp, 240, 96, 20));
		monster.add(new Monster(gp, 480, 96, 20));
		monster.add(new Monster(gp, 672, 96, 20));
		monster.add(new Monster(gp, 864, 96, 20));
	}

	public void round21Set() {
		gp.playSE(2);

		gp.setValueForMonster(2, 8, 2);

		monster.add(new Monster(gp, 48 - 24, 0, 20));
		monster.add(new Monster(gp, 144 - 24, 0, 20));
		monster.add(new Monster(gp, 240 - 24, 0, 20));
		monster.add(new Monster(gp, 336 - 24, 0, 20));
		monster.add(new Monster(gp, 432 - 24, 0, 20));
		monster.add(new Monster(gp, 528 - 24, 0, 20));
		monster.add(new Monster(gp, 624 - 24, 0, 20));
		monster.add(new Monster(gp, 720 - 24, 0, 20));
		monster.add(new Monster(gp, 816 - 24, 0, 20));
		monster.add(new Monster(gp, 912 - 24, 0, 20));

		monster.add(new Monster(gp, 48 - 24, 48, 20));
		monster.add(new Monster(gp, 144 - 24, 48, 20));
		monster.add(new Monster(gp, 240 - 24, 48, 20));
		monster.add(new Monster(gp, 336 - 24, 48, 20));
		monster.add(new Monster(gp, 432 - 24, 48, 20));
		monster.add(new Monster(gp, 528 - 24, 48, 20));
		monster.add(new Monster(gp, 624 - 24, 48, 20));
		monster.add(new Monster(gp, 720 - 24, 48, 20));
		monster.add(new Monster(gp, 816 - 24, 48, 20));
		monster.add(new Monster(gp, 912 - 24, 48, 20));

		monster.add(new Monster(gp, 48 - 24, 96, 20));
		monster.add(new Monster(gp, 144 - 24, 96, 20));
		monster.add(new Monster(gp, 240 - 24, 96, 20));
		monster.add(new Monster(gp, 336 - 24, 96, 20));
		monster.add(new Monster(gp, 432 - 24, 96, 20));
		monster.add(new Monster(gp, 528 - 24, 96, 20));
		monster.add(new Monster(gp, 624 - 24, 96, 20));
		monster.add(new Monster(gp, 720 - 24, 96, 20));
		monster.add(new Monster(gp, 816 - 24, 96, 20));
		monster.add(new Monster(gp, 912 - 24, 96, 20));
	}

	// add BOSS 2 IN ROUND 22
	public void round22Set() {
		gp.playSE(2);
		if (gp.bossFlag == false) {
			gp.bossLevel = 2;
			gp.playSE(2);
			gp.bossList.boss.add(new Boss(gp, 364, 48, 500));
			gp.bossFlag = true;
		}

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

					if (gp.bulletLevel < 10)
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
