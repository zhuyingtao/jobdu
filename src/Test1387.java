import java.util.Scanner;

public class Test1387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long j = 0;
			long k = 1;
			long sum = 1;
			for (int i = 2; i <= n; i++) {
				sum = j + k;
				j = k;
				k = sum;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
