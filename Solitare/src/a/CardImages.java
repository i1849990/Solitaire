package a;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;



public class CardImages {

	private Image img;
	private static int x, y;
	String fileName;
	
	public CardImages(int pX, int pY, String image) {
		x = pX;
		y = pY;
		img = getImage(fileName);
		
	}
	
	
	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Card.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	
	public static void paintCard(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g.drawLine(x-100, y, x, y);
	}
	
	public void paintNumber(Graphics g) {
		
	}
	
	
}
