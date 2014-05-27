import java.util.Scanner;

public class Test1089 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int sum = a + b;
				String a1 = new StringBuffer(a + "").reverse().toString();
				String b1 = new StringBuffer(b + "").reverse().toString();
				int sum1 = Integer.parseInt(a1) + Integer.parseInt(b1);
				int sum2 = Integer.parseInt(new StringBuffer(sum + "")
						.reverse().toString());
				if (sum1 == sum2) {
					System.out.println(sum);
				} else {
					System.out.println("NO");
				}
			}
		}
		scan.close();
	}
}
