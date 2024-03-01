package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import main.GamePanel;

public class GreenItemList {
	GamePanel gp;
	ArrayList<GreenItem> GreenItemList;

	public GreenItemList(GamePanel gp) { // Upgrade Bullet
		this.gp = gp;
		GreenItemList = new ArrayList<GreenItem>();
	}

	public void createList() { 
		int random = ThreadLocalRandom.current().nextInt(1, 25); // set the percentage = 1/20;
		if (random == 1) {
			int x_index = ThreadLocalRandom.current().nextInt(48, 912);
			GreenItemList.add(new GreenItem(gp, x_index, 0, x_index, 1008)); 
		}
	}
	
	public void update() { // update position of monsterList
		if (gp.countForMonsterBullet == 1) {
			createList();
		}
		
		for (int i = 0; i < GreenItemList.size(); i++) {
			GreenItemList.get(i).move(GreenItemList.get(i).destinationX, GreenItemList.get(i).destinationY);
			if (GreenItemList.get(i).y > 1007) {
				GreenItemList.remove(i);
			}
		}
	}

	public void draw(Graphics2D g2) {
		for (int i = 0; i < GreenItemList.size(); i++) {
			GreenItemList.get(i).draw(g2);
		}

	}
}
