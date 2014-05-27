import java.util.ArrayList;
import java.util.Scanner;

public class Test1087 {

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
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();

				ArrayList<Integer> divisor = new ArrayList<Integer>();
				ArrayList<Integer> times = new ArrayList<Integer>();

				for (int j = 2; j <= temp[i]; j++) { //约数个数定理
					if (temp[i] % j == 0) {
						temp[i] = temp[i] / j;
						if (divisor.contains(j)) {
							int k = divisor.indexOf(j);
							times.set(k, times.get(k) + 1);
						} else {
							divisor.add(j);
							times.add(1);
						}
						j = j - 1;
					}
				}

				int sum = 1;
				for (int j = 0; j < times.size(); j++) {
					sum = (times.get(j) + 1) * sum;
				}
				temp[i] = sum;
			}

			for (int i = 0; i < temp.length; i++) {
				System.out.println(temp[i]);
			}
		}
		scan.close();
	}
}
