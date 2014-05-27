import java.util.Scanner;

public class Test1026 {

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
			long a = scan.nextLong();
			long b = scan.nextLong();
			long s = a + b;

			if (s == 0)
				System.out.println(s);
			else {
				StringBuffer sb = new StringBuffer();
				while (s != 0) {
					long k = s % n;
					s = s / n;
					sb.insert(0, k);
				}
				System.out.println(sb);
			}
		}
		scan.close();
	}
}
