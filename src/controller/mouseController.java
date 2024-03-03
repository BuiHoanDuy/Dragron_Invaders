package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class mouseController implements MouseMotionListener, MouseListener {
	private GamePanel gp;

	public mouseController(GamePanel gp) {
		this.gp = gp;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (gp.menuCheck == 1) {
			if (e.getX() > 16 && e.getX() < 37 && e.getY() > 14 && e.getY() < 36) {
				gp.menuCheck = 4;
			}
		} else if (gp.menuCheck == 2) {
			if (e.getX() > 0 && e.getX() < 1008 && e.getY() > 0 && e.getY() < 720) {
				gp.menuCheck = 0;
			}
		} else if (gp.menuCheck == 4) {
			if (e.getX() > 240 && e.getX() < 750 && e.getY() > 280 && e.getY() < 345) {
				gp.menuCheck = 1;
			} else if (e.getX() > 350 && e.getX() < 645 && e.getY() > 420 && e.getY() < 480) {
				gp.menuCheck = 0;
			}
		} else {
			if (e.getX() > 410 && e.getX() < 560 && e.getY() > 250 && e.getY() < 320) { // play
				gp.menuCheck = 1;
			} else if (e.getX() > 310 && e.getX() < 720 && e.getY() > 350 && e.getY() < 410) { // how to play
				gp.menuCheck = 2;
			} else if (e.getX() > 390 && e.getX() < 650 && e.getY() > 460 && e.getY() < 510) { // exit
				gp.menuCheck = 3;
				System.exit(1);
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

}
