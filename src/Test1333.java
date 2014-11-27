import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年10月17日 下午3:23:27
 */
public class Test1333 {

	public static int format(int v, int n) {
		if (v < 0)
			v = 0;
		if (v > n)
			v = n;
		return v;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			boolean[][] covered = new boolean[n][n];
			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				int xs = format(scan.nextInt(), n);
				int ys = format(scan.nextInt(), n);
				int xe = format(scan.nextInt(), n);
				int ye = format(scan.nextInt(), n);
				for (int j = xs; j < xe; j++) {
					for (int j2 = ys; j2 < ye; j2++) {
						covered[j][j2] = true;
					}
				}
			}
			int count = 0;
			for (int i = 0; i < covered.length; i++) {
				for (int j = 0; j < covered.length; j++) {
					// System.out.print(covered[i][j] + " ");
					if (covered[i][j])
						count++;
				}
				// System.out.println();
			}
			System.out.println(n * n - count);
		}
		scan.close();
	}
}
