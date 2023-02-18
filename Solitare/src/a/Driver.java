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


public class Driver extends JPanel implements ActionListener, KeyListener {

	int screen_width = 900;
	int screen_height = 935;
	
	public Driver() {
		JFrame f = new JFrame();
		f.setTitle("Frogger");
		f.setSize(screen_width, screen_height);
		f.setResizable(false);
		f.addKeyListener(this); //listen for keypresses on this frame

		
		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		}
	
		Timer t;
	
	public void paint(Graphics g) {
		
			super.paintComponent(g);
			Pictures p = new Pictures(200, 100);
			p.paintCard("Ace", g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Deck d = new Deck();
			
			for (int i = 0; i < 52; i++) {
				System.out.println(d.getCards().get(i));
			}
			
			d.shuffle();
			for (int i = 0; i < 52; i++) {
				System.out.println(d.getCards().get(i));
			}
			
			Driver dr = new Driver();
			
			
			
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	

}
