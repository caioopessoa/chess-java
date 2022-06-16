package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //the piece is not yet on the board
		
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
}
