import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 下午8:17:36
 */
public class Test1492 {

	/**
	 * @param args
	 */
	public static int minSum(int[][] array, int m) {
		int minSum = 111111;
		int n = array.length;
		for (int i = 0; i < n && n - i >= m; i++) {
			for (int j = 0; j < n && n - j >= m; j++) {
				int sum = 0;
				for (int i2 = i; i2 < i + m; i2++) {
					for (int j2 = j; j2 < j + m; j2++) {
						sum += array[i2][j2];
					}
				}
				if (minSum > sum)
					minSum = sum;
			}
		}
		return minSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[][] array = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = scan.nextInt();
				}
			}
			int sum = minSum(array, m);
			System.out.println(sum);
		}
		scan.close();
	}
}
