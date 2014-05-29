import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 上午12:58:31
 */
public class Test1506 {

	/**
	 * @param args
	 */
	public static int sum(int n) {
		if (n == 1)
			return 1;
		else
			return n + sum(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(sum(n));
		}
		scan.close();
	}
}
