import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 上午12:53:51
 */
public class Test1513 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int m = scan.nextInt();
				String str = Integer.toBinaryString(m);
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '1')
						count++;
				}
				System.out.println(count);
			}
		}
		scan.close();
	}
}
