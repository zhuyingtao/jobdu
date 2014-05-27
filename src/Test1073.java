import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月24日 下午10:12:45
 */
public class Test1073 {

	/**
	 * @param args
	 */
	public static int fun(int row, int col) {
		if (col == 0)
			return 1;
		if (col == row + 1)
			return 1;
		return fun(row - 1, col - 1) + fun(row - 1, col);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[][] array = new int[n - 1][n];
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < i + 2; j++) {
					if (j == 0)
						array[i][j] = 1;
					else if (j == i + 1)
						array[i][j] = 1;
					else
						array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
					// array[i][j] = fun(i, j);
					sb.append(array[i][j] + (j == i + 1 ? "" : " "));
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}
}
