import java.util.Scanner;

public class Test1438 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int minGB = 1;
			for (int i = 2; i <= a && i <= b; i++) {
				if (a % i == 0 && b % i == 0) {
					minGB *= i;
					a = a / i;
					b = b / i;
					i = 1;
				}
			}
			System.out.println(minGB * a * b);
		}
		scan.close();
	}
}
