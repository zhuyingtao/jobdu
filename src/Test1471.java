import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月25日 上午1:45:26
 */
public class Test1471 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s1 = scan.next();
			String s2 = scan.next();
			StringBuffer sb = new StringBuffer();
			int n = s1.length();
			for (int i = 0; i < s1.length(); i++) {
				sb.append(s1.charAt(i));
				sb.append(s2.charAt(n - 1 - i));
			}
			System.out.println(sb.toString());
		}
		scan.close();
	}
}
