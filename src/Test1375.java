import java.util.Scanner;

public class Test1375 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				try {
					int a = scan.nextInt();
					if (a >= 1 && a <= n) {
						temp[a - 1] = 1;
					}
				} catch (Exception e) {
					scan.next();
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (temp[i] == 0)
					sum++;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
