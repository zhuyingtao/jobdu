import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午6:08:21
 */
public class Test1466 {

	/**
	 * @param args
	 */
	public static int compute(int n, int m) {
		int count = 0;
		for (int i = n; i > n - m; i--) {
			String str = Integer.toBinaryString(i);
			for (int j = str.length() - 1; j >= 0; j--) {
				if (str.charAt(j) != '0')
					break;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			int count=compute(n, m);
			System.out.println(count);
		}
		scan.close();
	}
}
