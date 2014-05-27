import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月28日 下午11:30:48
 */
public class Test1188 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int p = scan.nextInt();
			int[] temp = new int[n];
			int out = 0;
			StringBuffer sb = new StringBuffer();
			int i = 0;
			for (int j = 0; j < n; j++) {
				if (temp[j] == 0)
					i++;
				if (i == p) {
					temp[j] = 1;
					out++;
					i = 0;
					sb.append((j + 1) + " ");
				}
				if (j == n - 1 && out != n)
					j = -1;
			}
			System.out.println(sb.deleteCharAt(sb.length() - 1));
		}
		scan.close();
	}
}
