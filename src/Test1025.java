import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年9月7日 下午9:30:37
 */
public class Test1025 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double max = scan.nextDouble();
			int n = scan.nextInt();
			if (n == 0)
				break;
			ArrayList<Double> sums = new ArrayList<Double>();
			for (int i = 0; i < n; i++) {
				double sum = 0;
				int num = scan.nextInt();
				boolean isQualified = true;
				for (int j = 0; j < num; j++) {
					String item = scan.next();
					String[] temp = item.split(":");
					double cost = Double.parseDouble(temp[1]);
					if (!(temp[0].equals("A") || temp[0].equals("B") || temp[0]
							.equals("C")) || cost > 600) {
						isQualified = false;
						break;
					}
					sum += cost;
				}
				if (isQualified)
					sums.add(sum);
			}
		}
	}

}
