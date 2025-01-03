package com.geez14.app.controller;

import com.geez14.app.model.Map;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;

public class MapGenerator {
	Map m;

	public MapGenerator(int row, int col) {
		int[][] map = new int[row][col];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = 1;
			}
		}
		this.m = new Map(map);
		m.setBrickWidth(540 / col);
		m.setBrickHeight(150 / row);
	}

	public void draw(Graphics2D g) {
		int[][] map = m.getMap();
		int bh = m.getBrickHeight();
		int bw = m.getBrickWidth();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] > 0) 
				{
					g.setColor(Color.white);
					g.fillRect(j * bw + 80, i * bh + 50, bw, bh);
					// bricks seperator
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * bw + 80, i * bh + 50, bw, bh);
				}
			}
		}

	}

	public void setBrickValue(int value, int row, int col) {
		m.getMap()[row][col] = value;
	}
}
