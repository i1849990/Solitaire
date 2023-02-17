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
	public static void paintCard(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g.drawLine(x-100, y, x, y);
	}
	
	

}
