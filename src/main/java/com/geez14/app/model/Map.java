package com.geez14.app.model;

public class Map {
	private int map[][];
	private int brickWidth;
	private int brickHeight;
	
	public Map(int[][] parts, int brickHeight, int brickWidth) {
		this.map = parts;
		this.brickHeight = brickHeight;
		this.brickWidth = brickWidth;
	}
	public Map(int[][] parts) {
		this.map = parts;
	}
	/**
	 * @return the map
	 */
	public int[][] getMap() {
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(int map[][]) {
		this.map = map;
	}
	/**
	 * @return the brickWidth
	 */
	public int getBrickWidth() {
		return brickWidth;
	}
	/**
	 * @param brickWidth the brickWidth to set
	 */
	public void setBrickWidth(int brickWidth) {
		this.brickWidth = brickWidth;
	}
	/**
	 * @return the brickHeight
	 */
	public int getBrickHeight() {
		return brickHeight;
	}
	/**
	 * @param brickHeight the brickHeight to set
	 */
	public void setBrickHeight(int brickHeight) {
		this.brickHeight = brickHeight;
	}
}
