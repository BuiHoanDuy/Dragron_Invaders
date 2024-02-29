package entity;
//restore variables of player, monster, NPCs, ...

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Entity {
	public int x, y;
	public int speed;
	
	public BufferedImage mainCharacter; // image of Player
	public BufferedImage first, second, third; // image of Enermies
	public BufferedImage firstYellow, secondYellow, thirdYellow;
	public BufferedImage firstBlue, secondBlue, thirdBlue;
	public String direction; // the direction of Player. But we don't need it now;
	public int destinationPosionX, destinationPosionY; 	// the position that monster will move to;
	public BufferedImage HP; // HP of enities
	
}
