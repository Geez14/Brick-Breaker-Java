package com.geez14.app.controller;

import java.util.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.Timer;
import javax.swing.*;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean play = false;
	private int score = 0;

	private int totalBricks = 48;

	private Timer timer;
	private int delay = 8;

	private int playerX = 310;

	private int ballposX = 120;
	private int ballposY = 350;
	private int ballXdir = -1;
	private int ballYdir = -2;

	private MapGenerator map;

	public Gameplay() {
		map = new MapGenerator(4, 12);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics g) {
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);

		// drawing map
		g.setColor(Color.yellow);
		//		 x, y, width, height
		g.fillRect(0, 0, 3, 592);
		g.setColor(Color.blue);
		g.fillRect(0, 0, 692, 3);
		g.setColor(Color.yellow);
		g.fillRect(683, 0, 3, 592);

		// socres
		g.setColor(Color.white);
		g.setFont(new Font("serif", Font.BOLD, 25));
		g.drawString(Integer.toString(score), 590, 30);
		
		// the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		// the ball
		g.setColor(Color.pink);
		g.fillOval(ballposX, ballposY, 20, 20);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

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
}
