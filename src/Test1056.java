import java.util.Scanner;

public class Test1056 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int maxBase = 1;
			for (int i = 2; i <= x && i <= y; i++) {
				if (x % i == 0 && y % i == 0) {
					x = x / i;
					y = y / i;
					maxBase *= i;
					i = 1;
				}
			}
			System.out.println(maxBase);
		}
		scan.close();
	}
}
