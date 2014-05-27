import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午10:07:13
 */
public class Test1538 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] password = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7,
				7, 7, 8, 8, 8, 9, 9, 9, 9 };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				int pw = password[ch - 'a'];
				sb.append(pw);
			}
			System.out.println(sb);
		}
		scan.close();
	}
}
