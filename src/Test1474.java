import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午4:39:31
 */
public class Test1474 {

	/**
	 * @param args
	 */
	public static int[][] matrixMultiply(int[][] array1, int[][] array2) {
		int n = array1.length;
		int[][] temp = new int[n][n];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				int sum = 0;
				for (int k = 0; k < temp.length; k++) {
					sum += array1[i][k]*array2[k][j];
				}
				temp[i][j] = sum;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int t = scan.nextInt();
			for (int i = 0; i < t; i++) {
				int n = scan.nextInt();
				int k = scan.nextInt();
				int[][] array = new int[n][n];
				for (int j = 0; j < n; j++) {
					for (int l = 0; l < n; l++) {
						array[j][l] = scan.nextInt();
					}
				}
				int[][] temp = array;
				for (int j = 1; j < k; j++) {
					temp = matrixMultiply(temp, array);
				}
				for (int j = 0; j < temp.length; j++) {
					for (int j2 = 0; j2 < temp.length; j2++) {
						System.out.print(temp[j][j2]
								+ (j2 == temp.length - 1 ? "" : " "));
					}
					System.out.println();
				}
			}
		}
		scan.close();
	}
}
