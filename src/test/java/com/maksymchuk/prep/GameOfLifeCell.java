package com.maksymchuk.prep;

public class GameOfLifeCell {
	private int col;
	private int row;
	private int val;

	public GameOfLifeCell(int col, int row, int val) {
		super();
		this.col = col;
		this.row = row;
		this.val = val;
	}

	public int col() {
		return col;
	}

	public int row() {
		return row;
	}

	public int val() {
		return val;
	}
}
