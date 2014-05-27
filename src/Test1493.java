import java.util.ArrayList;
import java.util.Scanner;

public class Test1493 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			ArrayList<Integer> divisor = new ArrayList<Integer>();
			ArrayList<Integer> times = new ArrayList<Integer>();
			for (int i = 2; i <= a && i <= b; i++) {
				if (a % i == 0 && b % i == 0) {
					a = a / i;
					b = b / i;
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

			int sum = 1;
			for (int i = 0; i < times.size(); i++) {
				sum *= (times.get(i) + 1);
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
