import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 下午9:12:24
 */
public class Test1517 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			if (m == 0 || m > n) {
				System.out.println("NULL");
			} else {
				System.out.println(array[n - m]);
			}

		}
		scan.close();
	}
}
