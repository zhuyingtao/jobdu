import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 下午8:35:50
 */
public class Test1507 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int nOne = 0, nTwo = 0;
			do {
				nOne = n ^ m;
				nTwo = (n & m) << 1;
				n = nOne;
				m = nTwo;
			} while (nTwo != 0);
			System.out.println(nOne);
		}
		scan.close();
	}
}
