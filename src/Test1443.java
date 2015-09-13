import java.util.Scanner;

/**
 * @ClassName Test1443
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月2日 上午11:12:20
 */
public class Test1443 {

	static int mod = 9973;

	static class Matrix {
		int[][] matrix;
		int n;

		public Matrix(int n, int[][] matrix) {
			// TODO Auto-generated constructor stub
			this.n = n;
			this.matrix = matrix;
		}

		public Matrix multiply(Matrix m) {
			int[][] A = this.matrix;
			int[][] B = m.matrix;
			int[][] C = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						C[i][j] += A[i][k] * B[k][j];
					}
					C[i][j] %= mod;
				}
			}
			return new Matrix(n, C);
		}

		public int trace() {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j)
						sum += matrix[i][j];
				}
			}
			return sum % mod;
		}
	}

	public static Matrix power(Matrix m, int k) {
		// make an unit matrix;
		int len = m.n;
		int[][] n = new int[len][len];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if (i == j)
					n[i][j] = 1;
			}
		}
		Matrix ans = new Matrix(len, n);

		// quick multiply;
		while (k != 0) {
			if ((k & 1) == 1) {
				ans = ans.multiply(m);
			}
			m = m.multiply(m);
			k = k >> 1;
		}
		return ans;
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int t = scan.nextInt();
			for (int i = 0; i < t; i++) {
				int n = scan.nextInt();
				int k = scan.nextInt();
				int[][] matrix = new int[n][n];
				for (int j = 0; j < n; j++) {
					for (int j2 = 0; j2 < n; j2++) {
						matrix[j][j2] = scan.nextInt();
					}
				}
				Matrix m = new Matrix(n, matrix);
				Matrix result = power(m, k);
				int ans = result.trace();
				System.out.println(ans);
			}
		}
		scan.close();
	}
}
