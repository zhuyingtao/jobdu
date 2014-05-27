import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月25日 上午1:57:17
 */
public class Test1478 {

	/**
	 * @param args
	 */
	public static int max(int a, int b, int c) {
		return (a > b ? (a > c ? a : c) : (b > c ? b : c));
	}

	public static int min(int a, int b, int c) {
		return (a < b ? (a < c ? a : c) : (b < c ? b : c));
	}

	public static int mid(int a, int b, int c) {
		return (a < b ? (b < c ? b : (a < c ? c : a)) : (b > c ? b : (a > c ? c
				: a)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if (a == 0)
				break;
			System.out.println(min(a, b, c) + mid(a, b, c) - max(a, b, c));
		}
		scan.close();
	}
}
