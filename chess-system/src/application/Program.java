package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());//printing updated board
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);//reads origin position

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);//target position

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		}
		
	}

}
