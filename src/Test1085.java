import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月22日 下午5:50:13
 */
public class Test1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long x = scan.nextLong();
			long y = scan.nextLong();
			int k = scan.nextInt();

			x = (long) Math.pow((double) x, (double) y);
			String s = Long.toString(x);
			while (Long.parseLong(s) >= k){
				s = Long.toString(x, k);
			}
		}
		scan.close();
	}

}
