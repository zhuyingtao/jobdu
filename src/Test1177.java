import java.util.Scanner;

public class Test1177 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				String com = scan.next();
				int start = com.charAt(1) - '0';
				int len = com.charAt(2) - '0';
				String sub = str.substring(start, start + len);
				String replace = "";
				if (com.charAt(0) == '0') {
					replace = new StringBuffer(sub).reverse().toString();
					// for (int j = sub.length() - 1; j >= 0; j--) {
					// replace += sub.charAt(j);
					// }
				} else if (com.charAt(0) == '1') {
					replace = com.substring(3);
				}
				str = str.replace(sub, replace);
				System.out.println(str);
			}
		}
		scan.close();
	}
}
