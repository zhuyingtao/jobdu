import java.util.Scanner;

public class Test1031 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int count = 0;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
					count++;
				} else {
					n = (3 * n + 1) / 2;
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
