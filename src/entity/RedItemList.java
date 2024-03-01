package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import main.GamePanel;

public class RedItemList {
	GamePanel gp;
	ArrayList<RedItem> RedItemList;

	public RedItemList(GamePanel gp) { // plus number of Ulti / ulti ++;
		this.gp = gp;
		RedItemList = new ArrayList<RedItem>();
	}

	public void createList() { 
		int random = ThreadLocalRandom.current().nextInt(1, 50); // set the percentage = 1/20;
		if (random == 1) {
			int x_index = ThreadLocalRandom.current().nextInt(48, 912);
			RedItemList.add(new RedItem(gp, x_index, 0, x_index, 1008)); 
		}
	}
	
	public void update() { // update position of monsterList
		if (gp.countForMonsterBullet == 1) {
			createList();
		}
		
		for (int i = 0; i < RedItemList.size(); i++) {
			RedItemList.get(i).move(RedItemList.get(i).destinationX, RedItemList.get(i).destinationY);
			if (RedItemList.get(i).y > 1007) {
				RedItemList.remove(i);
			}
		}
	}

	public void draw(Graphics2D g2) {
		for (int i = 0; i < RedItemList.size(); i++) {
			RedItemList.get(i).draw(g2);
		}

	}
}
