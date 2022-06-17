package boardgame;

public class Board {

		private int rows;
		private int columns; 
		private Piece[][] pieces;
		
		public Board(int rows, int columns) {
			this.rows = rows;
			this.columns = columns;
			pieces = new Piece [rows][columns];//pieces matrix (matriz de peças)
		}

		public int getRows() {
			return rows;
		}

		public void setRows(int rows) {
			this.rows = rows;
		}

		public int getColumns() {
			return columns;
		}

		public void setColumns(int columns) {
			this.columns = columns;
		}
		
		public Piece piece(int row, int column) {//recebe linha e coluna e retorna peça
			return pieces[row][column]; 
		}
		
		public Piece piece(Position position) {//sobrecarga para receber posiçao
			return pieces[position.getRow()][position.getColumn()];
		}
}
