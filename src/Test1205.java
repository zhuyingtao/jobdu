import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年8月8日 下午4:47:32
 */
public class Test1205 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long[] count = new long[n + 1];
			count[1] = 1;
			if (n > 1) {
				count[2] = 2;
				for (int i = 3; i < count.length; i++) {
					count[i] = count[i - 1] + count[i - 2];
				}
			}
			System.out.println(count[n]);
		}
	}
}
