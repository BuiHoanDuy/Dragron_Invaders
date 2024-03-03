package main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Menu {
	GamePanel gp; Graphics2D g2;
	public BufferedImage menuImage;
	public BufferedImage howToPlayImage;
	public BufferedImage pauseMenuImage;
	public BufferedImage winnerImage;
	public Menu(GamePanel gp) {
		this.gp = gp;
		this.g2 = g2;
		try {
			menuImage = ImageIO.read(getClass().getResourceAsStream("/res/MENU.png"));
			howToPlayImage = ImageIO.read(getClass().getResourceAsStream("/res/howToPlay.png"));
			pauseMenuImage = ImageIO.read(getClass().getResourceAsStream("/res/pause_menu.png"));
			winnerImage = ImageIO.read(getClass().getResourceAsStream("/res/YouWin.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(int menuCheck) {
		if (menuCheck == 3) { // Exit game
			System.exit(1);
		}
	}

	public void draw(Graphics2D g2, int menuCheck) {
		if (menuCheck == 0) {
			g2.drawImage(menuImage, 0, 0, gp.screenWidth, gp.screenHeight, null);			
		} else if (menuCheck == 2) {
			g2.drawImage(howToPlayImage, 0, 0, gp.screenWidth, gp.screenHeight, null);			
		} else if (menuCheck == 4) {
			g2.drawImage(pauseMenuImage, 0, 0, gp.screenWidth, gp.screenHeight, null);	
		} else if (menuCheck == 5) { // WIN
			g2.drawImage(winnerImage, 0, 0, gp.screenWidth, gp.screenHeight, null);	
		}
	}
}
