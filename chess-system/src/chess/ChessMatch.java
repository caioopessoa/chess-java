package chess;

import boardgame.Board;
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {//more intuitive way to place pieces 
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {//creating initial place for each piece
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}