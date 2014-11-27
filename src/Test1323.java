import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年10月17日 下午2:35:15
 */
public class Test1323 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double[] bestValue = new double[3];
			int[] bestNo = new int[3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					double value = scan.nextDouble();
					if (value > bestValue[i]) {
						bestValue[i] = value;
						bestNo[i] = j;
					}
				}
			}
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < bestNo.length; i++) {
				if (bestNo[i] == 0)
					sb.append("W ");
				else if (bestNo[i] == 1)
					sb.append("T ");
				else if (bestNo[i] == 2)
					sb.append("L ");
			}
			double times = 1;
			for (double d : bestValue) {
				times *= d;
			}
			times = times * 0.65 - 1;
			double sum = times * 2;
			sb.append(new DecimalFormat("0.00").format(sum));
			System.out.println(sb);
		}
		scan.close();
	}
}
