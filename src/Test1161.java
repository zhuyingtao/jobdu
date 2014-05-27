import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月26日 下午12:43:04
 */

public class Test1161 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			char[][] base = new char[n][n];
			scan.nextLine();
			for (int i = 0; i < n; i++) {
				String str = scan.nextLine();
				for (int j = 0; j < str.length(); j++) {
					base[i][j] = str.charAt(j);
				}
			}

			int scale = scan.nextInt();
			int size = n * n;
			int len = n;
			while (scale > 1) {
				char[][] temp = new char[size * n][size * n];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {

						for (int l = i * len; l < (i + 1) * len; l++) {
							for (int k = j * len; k < (j + 1) * len; k++) {
								if (base[i][j] == ' ')
									temp[l][k] = ' ';
								else
									temp[l][k] = base[i][j];
							}
						}
					}
				}
				base = temp;
				len = len * n;
				size = size * n;
				scale--;
			}
			for (int i = 0; i < base.length; i++) {
				for (int j = 0; j < base[i].length; j++) {
					System.out.print(base[i][j]);
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
