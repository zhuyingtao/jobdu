import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月31日 上午1:34:09
 */
public class Test1457 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int s = scan.nextInt();
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (s == 0 && n == 0 && m == 0)
				break;
			if (s % 2 != 0) {
				System.out.println("NO");
			} else {
				if (n == m)
					System.out.println("2");
				else {
					int min = n > m ? m : n;
					int max = n > m ? n : m;
				}
			}
		}
		scan.close();
	}

}
