import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月12日 下午6:24:57
 */
public class Test1113 {

	/**
	 * @param args
	 */
	public static int n;

	public static int childCount(int m) {
		if (m > n)
			return 0;
		else
			return childCount(m * 2) + childCount(m * 2 + 1) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		// while (scan.hasNext()) {
		// int m = scan.nextInt();
		// n = scan.nextInt();
		// if (m == 0 && n == 0)
		// break;
		// System.out.println(childCount(m));
		// }
		// scan.close();

		// /////////////////////////////////
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			if (m == 0 && n == 0)
				break;
			int count = 0;
			int depth = 0;
			while (m <= n) {
				int depthFull = (int) Math.pow(2, depth);
				if (m + depthFull - 1 <= n)
					count += depthFull;
				else
					count += n - m + 1;
				depth++;
				m = m * 2;
			}
			System.out.println(count);
		}
		scan.close();
	}
}
