import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @ClassName Test1137
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月6日 上午11:36:24
 */
public class Test1137 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				BigDecimal bd1 = new BigDecimal(scan.next());
				BigDecimal bd2 = new BigDecimal(scan.next());
				BigDecimal bd3 = bd1.add(bd2);
				DecimalFormat df = new DecimalFormat("0.0#######################################"
						+ "###########################################################");
				System.out.println(df.format(bd3));
			}
		}
		scan.close();
	}
}
