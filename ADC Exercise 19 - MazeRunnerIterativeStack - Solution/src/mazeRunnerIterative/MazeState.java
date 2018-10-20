package mazeRunnerIterative;

public class MazeState {
	protected char[][] board;		// This is the actual maze... a set of visited cells and walls
	protected int[][] mark;			// This is the record of chalk marks
	private int row;
	private int column;
	
	public MazeState(char[][] b, int[][] m, int r, int c) {
		board = new char[b.length][b[0].length];
		mark = new int[m.length][m[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++) {
				board[i][j] = b[i][j];
				mark[i][j] = m[i][j];
			}
		row = r;
		column = c;
	}
	
	public char[][] getBoard() {
		return board;
	}

	public int[][] getMark() {
		return mark;
	}

	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
}