package chess;

import boardgame.Board;

public class ChessMatch {//game rules
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces () {//return chess matrix of this match
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];//create matrix
		for (int i=0; i<board.getRows(); i++) { //for each piece, downcast to the matrix
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //interpretate as a chess piece, not a common piece
			}
		
		}
		
		return mat;	
	}
}