import java.util.ArrayList;
import java.util.Scanner;

public class Test1207 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			ArrayList<Integer> divisor = new ArrayList<Integer>();
			ArrayList<Integer> times = new ArrayList<Integer>();

			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					n = n / i;
					if (divisor.contains(i)) {
						int k = divisor.indexOf(i);
						times.set(k, times.get(k) + 1);
					} else {
						divisor.add(i);
						times.add(1);
					}
					i = i - 1;
				}
			}
			
			int sum = 0;
			for (int i = 0; i < times.size(); i++) {
				sum +=times.get(i);
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
