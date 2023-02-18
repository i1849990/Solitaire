package a;

import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.image.*;
import java.awt.geom.AffineTransform;
import java.lang.Object;
import java.net.URL;


public class Pictures {

	private static int x;
	private static int y;
	
	public Pictures(int pX, int pY) {
		x = pX;
		y = pY;
	}
	
	public static int getX() {
		return x;
	}
	
	public static int getY() {
		return y;
	}
	public void paintCard(String symbol, Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		drawCardBoarder(getX(), getY(), g);
		drawSymbol(symbol, g);
	}
	
	public void drawCardBoarder(int x, int y, Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g.drawLine(x, y, x+250, y);
		g.drawLine(x, y, x, y+350);
		g.drawLine(x+250, y, x+250, y+350);
		g.drawLine(x, y+350, x+250, y+350);
	}
	
	public void drawSymbol(String symbol, Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		char[] temp = new char[symbol.length()-1];
		for (int i = 0; i < temp.length; i ++) {
			temp[i] = symbol.charAt(i);
		}
		Font f = new Font("Arial",Font.BOLD,50);
		g.setFont(f);
		g.drawChars(temp, 0, 1, 210, 150);
		Font f1 = new Font("Arial",Font.BOLD,-50);
		g.drawChars(temp, 0, 1, 440, 400);
	}
	
	

}
