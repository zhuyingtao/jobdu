import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月30日 下午9:57:59
 */
public class Test1464 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			int n = str.length();
			int n2 = (n + 2) / 3;
			int n1 = n + 2 - 2 * n2;
			// System.out.println(n1 + " " + n2);
			char[][] ch = new char[n2][n1];
			int index = 0;
			for (int i = 0; i < n2 - 1; i++) {
				ch[i][0] = str.charAt(index++);
			}
			for (int i = 0; i < n1; i++) {
				ch[n2 - 1][i] = str.charAt(index++);
			}
			for (int i = n2 - 2; i >= 0; i--) {
				ch[i][n1 - 1] = str.charAt(index++);
			}
			for (int i = 0; i < ch.length; i++) {
				for (int j = 0; j < ch[i].length; j++) {
					if (ch[i][j] == '\0')
						System.out.print(' ');
					else
						System.out.print(ch[i][j]);
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
