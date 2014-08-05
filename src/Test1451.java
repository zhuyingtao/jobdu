import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月30日 上午1:21:06
 */
public class Test1451 {

	/**
	 * @param args
	 */
	public static long fun(long n) {
		if (n == 2)
			return 1;
		if (n <= 1)
			return 0;
		return (n - 1) * (fun(n - 1) + fun(n - 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(fun(n));
		}
		scan.close();
	}

}
