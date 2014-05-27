import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月8日 下午8:24:42
 */
public class Test1124 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			if (str.equals("0"))
				break;
			int sum;
			do {
				sum = 0;
				for (int i = 0; i < str.length(); i++)
					sum += str.charAt(i) - '0';
				str = sum + "";
			} while (sum >= 10);
			System.out.println(sum);
		}
		scan.close();
	}
}
