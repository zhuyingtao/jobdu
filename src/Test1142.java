import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月6日 下午3:49:55
 */
public class Test1142 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int caseID = 0;
		while (scan.hasNext()) {
			int[][] buf = new int[3][22000];
			int p = scan.nextInt();
			int e = scan.nextInt();
			int i = scan.nextInt();
			int d = scan.nextInt();
			caseID++;
			if (p == -1 && e == -1 && i == -1 && d == -1)
				break;
			for (int j = p; j < 22000; j = j + 23)
				buf[0][j] = 1;
			for (int j = e; j < 22000; j = j + 28)
				buf[1][j] = 1;
			for (int j = i; j < 22000; j = j + 33)
				buf[2][j] = 1;
			for (int j = d + 1; j < 22000; j++) {
				if (buf[0][j] == 1 && buf[1][j] == 1 && buf[2][j] == 1) {
					System.out.println("Case " + caseID
							+ ": the next triple peak occurs in " + (j - d)
							+ " days.");
					break;
				}
			}
		}
		scan.close();
	}
}
