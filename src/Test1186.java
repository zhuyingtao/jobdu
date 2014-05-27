import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月6日 下午10:33:52
 */
public class Test1186 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		while (scan.hasNext()) {
			int year = scan.nextInt();
			int day = scan.nextInt();
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
				months[1] = 29;
			} else
				months[1] = 28;
			int month = 0;
			for (int i = 0; i < months.length; i++) {
				if (day <= months[i]) {
					month = i + 1;
					break;
				}
				day = day - months[i];
			}
			DecimalFormat df = new DecimalFormat("00");
			System.out.println(new DecimalFormat("0000").format(year) + "-"
					+ df.format(month) + "-" + df.format(day));
		}
		scan.close();
	}
}
