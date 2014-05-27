import java.util.Scanner;

public class Test1171 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[][] array = new int[5][5];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					array[i][j] = scan.nextInt();
				}
			}
			int dir = scan.nextInt();
			int rows = scan.nextInt();
			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;
			int[][] temp = new int[rows][rows];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < rows; j++) {
					if (dir == 1)
						temp[j][i] = array[x + rows - 1 - i][y + j];
					else if (dir == 2)
						temp[j][i] = array[x + i][y + rows - 1 - j];
				}
			}

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < rows; j++) {
					array[x + i][y + j] = temp[i][j];
				}
			}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(array[i][j] + (j == 4 ? "" : " "));
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
