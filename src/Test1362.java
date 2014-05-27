import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年3月28日 下午12:53:38
 */
public class Test1362 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			StringBuffer str = new StringBuffer(scan.next());
			int n = scan.nextInt();
			String temp = str.substring(0, n % str.length());
			str = str.delete(0, n % str.length()).append(temp);
			System.out.println(str);
		}
		scan.close();
	}
}
