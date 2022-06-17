package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {//game rules
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); //launch a 8 per 8 board
		initialSetup(); //launch the initial setup
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
	
	private void initialSetup() {//creating initial place for each piece
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
	}
}