public class twoDArray {
	public static void main(String[] args) {
		// Instantiate the 2D array or char
		char[][] board = new char[][] {
			new char[] {'_', 'X', '_'},
			new char[] {'O', 'X', '_'},
			new char[] {'O', 'X', '_'},
		};

		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
