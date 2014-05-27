import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午5:17:38
 */
public class Test1470 {

	/**
	 * @param args
	 */
	public static int findMax(int[][] array, int column) {
		int maxIndex = column;
		int max = array[column][column];
		for (int i = column; i < array.length; i++) {
			if (max < array[i][column]) {
				max = array[i][column];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void swap(int[][] array, int m, int n) {
		for (int j = 0; j < array.length; j++) {
			int temp = array[m][j];
			array[m][j] = array[n][j];
			array[n][j] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[][] array = new int[n][n];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = scan.nextInt();
				}
			}
			for (int i = 0; i < array.length; i++) {
				int maxIndex = findMax(array, i);
				swap(array, i, maxIndex);
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j] + (j == n - 1 ? "" : " "));
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
