import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月20日 下午8:31:47
 */
public class Test1164 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int flag = -1;
			boolean hasFound = false;
			int[][] matrix1 = new int[n][n];
			int[][] matrix2 = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					matrix1[i][j] = scan.nextInt();

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					matrix2[i][j] = scan.nextInt();

			// 123 741 987 369
			// 456 852 654 258
			// 789 963 321 147
			boolean breaked = false;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (matrix1[i][j] != matrix2[i][j]) {
						breaked = true;
						break;
					}
					if (i == n - 1 && j == n - 1) {
						flag = 0;
						hasFound = true;
					}
				}
				if (breaked)
					break;
			}

			// (0,0)->(0,2) (0,1)->(1,2) (0,2)->(2,2)
			breaked = false;
			if (!hasFound)
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (matrix1[i][j] != matrix2[j][n - 1 - i]) {
							breaked = true;
							break;
						}
						if (i == n - 1 && j == n - 1) {
							flag = 90;
							hasFound = true;
						}
					}
					if (breaked)
						break;
				}

			// (0,0)->(2,2) (1,1)->(1,1) (2,1)->(0,1)
			breaked = false;
			if (!hasFound)
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (matrix1[i][j] != matrix2[n - 1 - i][n - 1 - j]) {
							breaked = true;
							break;
						}
						if (i == n - 1 && j == n - 1) {
							flag = 180;
							hasFound = true;
						}
					}
					if (breaked)
						break;
				}

			// (0,0)->(2,0) (1,1)->(1,1) (1,2)->(0,1)
			breaked = false;
			if (!hasFound)
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (matrix1[i][j] != matrix2[n - 1 - j][i]) {
							breaked = true;
							break;
						}
						if (i == n - 1 && j == n - 1) {
							flag = 270;
							hasFound = true;
						}
					}
					if (breaked)
						break;
				}
			System.out.println(flag);
		}
		scan.close();
	}
}
