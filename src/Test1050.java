import java.util.Scanner;

public class Test1050 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			boolean isFirst = true;
			for (int i = 2; i <= n; i++) {
				int sum = 0;
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						sum += j;
					}
				}
				if (i == sum) {
					if (isFirst == true) {
						System.out.print(i);
						isFirst = false;
					} else {
						System.out.print(" " + i);
					}
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
