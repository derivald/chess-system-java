package boardgame;

public class Board {
	
	private int rows;
	private int column;
	private Piece[][] pieces;
	public Board(int rows, int column) {
		
		this.rows = rows;
		this.column = column;
		pieces = new Piece[rows][column];
	}
	protected int getRows() {
		return rows;
	}
	protected void setRows(int rows) {
		this.rows = rows;
	}
	protected int getColumn() {
		return column;
	}
	protected void setColumn(int column) {
		this.column = column;
	}
	

}
