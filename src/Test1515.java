import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午7:26:45
 */
public class Test1515 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 1; i < Math.pow(10, n); i++) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
