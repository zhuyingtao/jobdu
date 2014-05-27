import java.util.Scanner;

public class Test1077 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long[] temp = new long[n];
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextLong();
			}
			
			long max = -999999999;
			for (int i = 0; i < n; i++) {
				long sum = temp[i];
				for (int j = i + 1; j < n; j++) {
					if (temp[j] >= 0) {
						sum += temp[j];
					} else {
						long restSum = 0;
						for (int k = j + 1; k < n; k++) {
							restSum += temp[k];
						}
						if (temp[j] + restSum <= 0) {
							break;
						} else {
							sum += temp[j];
						}
					}
				}
				if (sum > max)
					max = sum;
			}
			System.out.println(max);
		}
		scan.close();
	}
}
