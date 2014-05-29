import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月29日 上午1:22:49
 */
public class Test1441 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a == 0 && b == 0)
				break;
			int result = 1;
			for (int i = 0; i < b; i++) {
				result *= a;
				result = result % 1000;
			}
			System.out.println(result);
		}
		scan.close();
	}
}
