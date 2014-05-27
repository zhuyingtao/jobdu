import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年3月26日 下午8:58:01
 */
public class Test1122 {

	/**
	 * @param args
	 */
	public static int f(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return f(n - 1) + f(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int result=f(n);
			System.out.println(result);
		}
		scan.close();
	}
}
