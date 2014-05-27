import java.util.Scanner;

public class Test1001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int rows = scan.nextInt();
			if (rows == 0)
				break;
			int cols = scan.nextInt();
			
			int[][] A = new int[rows][cols];
			int[][] B = new int[rows][cols];
			int[][] C = new int[rows][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					A[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					B[i][j] = scan.nextInt();
					C[i][j] = A[i][j] + B[i][j];
				}
			}

			int zeroRows = 0;
			int zeroCols = 0;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (C[i][j] != 0)
						break;
					if (j == cols - 1)
						zeroRows++;
				}
			}
			for (int i = 0; i < cols; i++) {
				for (int j = 0; j < rows; j++) {
					if (C[j][i] != 0)
						break;
					if (j == rows - 1)
						zeroCols++;
				}
			}
			System.out.println(zeroRows + zeroCols);
		}
		scan.close();
	}
}
