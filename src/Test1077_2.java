import java.util.Scanner;

public class Test1077_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long[] temp = new long[n];
			long[] sum = new long[n];
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextLong();
				sum[i] = temp[i];
			}
			for (int i = 1; i < n; i++) {
				if (sum[i - 1] > 0) {
					sum[i] += sum[i - 1];
				}
			}
			long max = Long.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				if (sum[i] > max)
					max = sum[i];
			}
			System.out.println(max);
		}
		scan.close();
	}
}
