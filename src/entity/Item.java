package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Item {
	public int x, y;
	public int speed;
	public int destinationX, destinationY;
	
	public BufferedImage ItemImage;
	
	public void move(int xx, int yy) { // move bullet slowly to the determined point
		if (x == xx && y == yy)
			return;
		else {
			if (x < xx) {
				x += speed;
			}
			else if (x > xx){
				x -= speed;
			}
			
			if (y < yy) {
				y += speed;
			}
			else if (y > yy) {
				y -= speed;
			}
		}
	}
	
	public void getImage(String path) {
		try {
			ItemImage = ImageIO.read(getClass().getResourceAsStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
