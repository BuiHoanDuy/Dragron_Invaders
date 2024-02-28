package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

import main.GamePanel;

public class monsterBulletList {
	GamePanel gp;
	ArrayList<Bullet> bullet;

	public monsterBulletList(GamePanel gp) {
		this.gp = gp;
		bullet = new ArrayList<Bullet>();
	}


	public void createMonsterBulletList() {

		// random the positon of monsterBullet and set the percentage of it.
		int randomMonsterIndex = 0;
		int random = ThreadLocalRandom.current().nextInt(1, 2);
		if (gp.monsterList.monster.size() > 0) {
			randomMonsterIndex = ThreadLocalRandom.current().nextInt(0, gp.monsterList.monster.size());
			if (random == 1) {
				
				System.out.println(1);
				
				Bullet bulletTemp = new Bullet(gp, gp.monsterList.monster.get(randomMonsterIndex).x, 750);
				bulletTemp.setValue(gp.monsterList.monster.get(randomMonsterIndex).x,
						gp.monsterList.monster.get(randomMonsterIndex).y);
				bullet.add(bulletTemp);
			}
		}
		
	}

	public void update() { // update position of monsterList
		
		// reset counterForMonster
		if (gp.countForMonsterBullet == 50) gp.countForMonsterBullet = 0;
		
		if (gp.countForMonsterBullet == 1) {
			createMonsterBulletList();
		}

		for (int i = 0; i < bullet.size(); i++) {
			bullet.get(i).move(bullet.get(i).destinationPosionX, bullet.get(i).destinationPosionY);
			if (bullet.get(i).y == 749) {
				bullet.remove(i);
			}
		}

	}

	public void draw(Graphics2D g2) {
		for (int i = 0; i < bullet.size(); i++) {
			bullet.get(i).drawMonsterBullet(g2);
		}
	}
}
