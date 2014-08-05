import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年6月1日 下午8:45:18
 */
class Rice implements Comparable<Rice> {
	int price;
	int weight;
	int number;
	double value;

	public Rice(int price, int weight, int number) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.weight = weight;
		this.number = number;
		this.value = this.price * 1.0 / this.weight;
	}

	@Override
	public int compareTo(Rice o) {
		// TODO Auto-generated method stub
		return Double.compare(this.value, o.value);
	}
}

public class Test1455 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();
			int k = scan.nextInt();
			int w = 0;
			Rice[] rices = new Rice[k];
			for (int j = 0; j < k; j++) {
				int p = scan.nextInt();
				int h = scan.nextInt();
				int c = scan.nextInt();
				Rice rice = new Rice(p, h, c);
				rices[j] = rice;
			}
			Arrays.sort(rices);
			for (int j = 0; j < rices.length; j++) {
				Rice rice = rices[j];
				if (m >= rice.number * rice.price) {
					w += rice.number * rice.weight;
					m -= rice.number * rice.price;
				} else {
					int num = m / rice.price;
					w += rice.weight * num;
					m -= rice.price * num;
				}
				if (m == 0)
					break;
			}
			System.out.println(w);
		}
		scan.close();
	}
}
