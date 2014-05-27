import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月25日 上午1:49:54
 */
public class Test1476 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			boolean canDiv = false;
			for (int i = 2; i < 100; i++) {
				if (n % (i * i) == 0) {
					canDiv = true;
					break;
				}
			}
			System.out.println(canDiv ? "Yes" : "No");
		}
		scan.close();
	}
}
