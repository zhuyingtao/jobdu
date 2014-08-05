import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年6月27日 下午10:18:40
 */
public class Test1038 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fac = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			boolean can = false;
			for (int i = fac.length - 1; i >= 0; i--) {
				if (n < fac[i])
					continue;
				else
					n -= fac[i];
			}
			if (n == 0)
				can = true;
			System.out.println(can ? "YES" : "NO");
		}
		scan.close();
	}
}
