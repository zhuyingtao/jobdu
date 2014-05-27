import java.util.Scanner;

public class Test1047 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n <= 1)
				System.out.println("no");
			else {
				boolean flag = true;
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
		scan.close();
	}
}
