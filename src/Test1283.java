import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年3月28日 下午4:47:04
 */

public class Test1283 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			// for (int i = 0; i < str.length(); i++) {
			// boolean onlyOnce = true;
			// char ch = str.charAt(i);
			// for (int j = i + 1; j < str.length(); j++) {
			// if (str.charAt(j) == ' ')
			// continue;
			// if (ch == str.charAt(j)) {
			// onlyOnce = false;
			// str = str.replace(ch, ' ');
			// break;
			// }
			// }
			// if (onlyOnce && ch != ' ') {
			// System.out.println(i);
			// break;
			// }
			// if (i == str.length() - 1)
			// System.out.println("-1");
			// }
			boolean isFind = false;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(i);
					isFind = true;
					break;
				}
			}
			if (!isFind)
				System.out.println("-1");

		}
		scan.close();
	}
}
