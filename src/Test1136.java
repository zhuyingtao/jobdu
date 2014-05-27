import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014-4-7 обнГ10:28:18
 */
public class Test1136 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				if (x % 2 == 0) {
					if (x == y || x == y + 2)
						System.out.println(x + y);
					else
						System.out.println("No Number");
				} else {
					if (x == y || x == y + 2)
						System.out.println(x + y - 1);
					else
						System.out.println("No Number");
				}
			}
		}
		scan.close();
	}
}
