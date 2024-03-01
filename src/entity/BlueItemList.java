package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import main.GamePanel;

public class BlueItemList {
	GamePanel gp;
	ArrayList<BlueItem> BlueItemList;

	public BlueItemList(GamePanel gp) { // refill HP
		this.gp = gp;
		BlueItemList = new ArrayList<BlueItem>();
	}

	public void createList() { 
		int random = ThreadLocalRandom.current().nextInt(1, 50); // set the percentage = 1/20;
		if (random == 1) {
			int x_index = ThreadLocalRandom.current().nextInt(48, 912);
			BlueItemList.add(new BlueItem(gp, x_index, 0, x_index, 1008)); 
		}
	}
	
	public void update() { // update position of monsterList
		if (gp.countForMonsterBullet == 1) {
			createList();
		}
		
		for (int i = 0; i < BlueItemList.size(); i++) {
			BlueItemList.get(i).move(BlueItemList.get(i).destinationX, BlueItemList.get(i).destinationY);
			if (BlueItemList.get(i).y > 1007) {
				BlueItemList.remove(i);
			}
		}
	}

	public void draw(Graphics2D g2) {
		for (int i = 0; i < BlueItemList.size(); i++) {
			BlueItemList.get(i).draw(g2);
		}

	}
}
