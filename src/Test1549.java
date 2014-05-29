import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 下午9:46:15
 */
public class Test1549 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bit = { 100, 50, 20, 10, 5, 2, 1 };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int num = 0;
			for (int i = 0; i < bit.length; i++) {
				if (n < bit[i])
					continue;
				else {
					int num1 = n / bit[i];
					num += num1;
					n = n % bit[i];
				}
			}
			System.out.println(num);
		}
		scan.close();
	}
}
