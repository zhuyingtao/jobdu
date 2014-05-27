import java.util.Scanner;

public class Test1067 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int n = scan.nextInt();
			long ans = 1;
			for (int i = 1; i <= n; i++) {
				ans = ans * i;
			}
			System.out.println(ans);
		}
		scan.close();
	}
}
