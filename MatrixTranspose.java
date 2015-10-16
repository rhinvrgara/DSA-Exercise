import java.util.Scanner;

class MatrixTranspose {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int rows = 0, cols = 0;
		int[][] matrix, result;
		
		System.out.println("Enter size of Matrix...");
		System.out.print("How many rows? ");
		rows = in.nextInt();
		System.out.print("How many columns? ");
		cols = in.nextInt();
		matrix = new int[rows][cols];
		
		for ( int r = 0; r<rows; r++) {
			System.out.print("Enter "+ cols +" " + "values for rows"+ r +":  ");
			for (int c = 0; c<cols; c++)
			matrix[r][c] = in.nextInt();
			}
			
			result = new int[cols][rows];
			for (int r = 0; r<cols; r++) {
				for (int c = 0; c<rows; c++) 
				{
					result[r][c] = matrix[c][r];
				}
			}
			
			System.out.println(" Result of Transpose: ");
			for (int i = 0; i<cols; i++) {
				for (int j = 0; j<rows; j++) {
					System.out.print(" " +result[i][j] + " ");
				}
				System.out.println();
			}
		System.out.println("Thanks for using my Program :)");
		}
}
