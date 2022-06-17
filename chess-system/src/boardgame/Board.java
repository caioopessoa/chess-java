package boardgame;

public class Board {

		private int rows;
		private int columns; 
		private Piece[][] pieces;
		
		public Board(int rows, int columns) {
			if (rows < 1 || columns < 1) {
				throw new BoardException ("Error creating board: there must be at least 1 row and 1 column");
			}
			this.rows = rows;
			this.columns = columns;
			pieces = new Piece [rows][columns];//pieces matrix (matriz de peças)
		}

		public int getRows() {
			return rows;
		}


		public int getColumns() {
			return columns;
		}

		
		public Piece piece(int row, int column) {//recebe linha e coluna e retorna peça
			if (!positionExists(row,column)) {//checking if the chosen position exists
				throw new BoardException("Position not on the board");
			}
			return pieces[row][column]; 
		}
		
		public Piece piece(Position position) {//sobrecarga para receber posiçao
			if (!positionExists(position)) {//checking if the chosen position exists, before receiving
				throw new BoardException("Position not on the board");
			}
			return pieces[position.getRow()][position.getColumn()];
		}
		
		public void placePiece(Piece piece, Position position) {//put a piece in a determined position
			if (thereIsAPiece(position)) {//checking if the position is already occupied
				throw new BoardException("There is already a piece on position" + position);
			}
			pieces[position.getRow()][position.getColumn()] = piece; //change a pieces position
			piece.position = position;
		
		}
		
		private boolean positionExists(int row, int column) {//verify if the chosen position exists
			return row >= 0 && row < rows && column >= 0 && column < columns; //boolean
			
		}
		
		public boolean positionExists(Position position) { //verify if the chosen position exists
			return positionExists(position.getRow(), position.getColumn()); //boolean
			
		}
		
		public boolean thereIsAPiece(Position position) {//verify if the chosen position already has a piece
			if (!positionExists(position)) {//checking if the chosen position exists
				throw new BoardException("Position not on the board");
			}
			return piece(position) != null; 
		}
		
		
}
