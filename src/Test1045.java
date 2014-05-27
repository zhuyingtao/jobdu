import java.util.Scanner;

public class Test1045 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i <= 100; i++) {
				for (int j = 0; j <= 100; j++) {
					int k = 100 - (i + j);
					if (5 * i + 3 * j + (double)k / 3 > n)
						break;
					else
						System.out.println("x=" + i + ",y=" + j + ",z=" + k);
				}
			}
		}
		scan.close();
	}
}
