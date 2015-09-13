import java.util.Scanner;

/**
 * @ClassName Test1454
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月12日 下午9:30:06
 */
public class Test1454 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int t = scan.nextInt();
			for (int i = 0; i < t; i++) {
				int s = scan.nextInt();
				int e = scan.nextInt();
				int n = scan.nextInt();
				int[] price = new int[n];
				int[] weight = new int[n];
				for (int j = 0; j < n; j++) {
					price[j] = scan.nextInt();
					weight[j] = scan.nextInt();
				}

				// get the minimum value/weight;
				double[] value = new double[n];
				int minIndex = 0;
				for (int j = 0; j < value.length; j++) {
					value[j] = price[j] / weight[j];
					if (value[minIndex] > value[j]) {
						minIndex = j;
					}
				}

				int sumWeight = e - s;
				int sumPrice = 0;
				int count = 0;
				while (sumWeight > 0 && count < n) {
					if (sumWeight / weight[minIndex] > 0) {
						int num = sumWeight / weight[minIndex];
						sumPrice += price[minIndex] * num;
						sumWeight -= weight[minIndex] * num;
					}
					value[minIndex] = 1000000;
					// find the next minimum value;
					for (int j = 0; j < value.length; j++) {
						if (value[minIndex] > value[j])
							minIndex = j;
					}
					count++;
				}
				if (sumWeight > 0) {
					System.out.println("This is impossible.");
				} else {
					System.out.println("The minimum amount of money in the piggy-bank is " + sumPrice + ".");
				}
			}
		}
		scan.close();
	}
}
