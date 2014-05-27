import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月8日 下午9:30:51
 */
public class Test1088 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] temp = new int[n + 1];

			for (int i = 0; i < k; i++) {
				int s = scan.nextInt();
				int e = scan.nextInt();
				for (int j = s; j <= e; j++) {
					temp[j] = -1;
				}
			}

			int count = 0;
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] == 0)
					count++;
			}
			System.out.println(count);
		}
		scan.close();
	}
}
