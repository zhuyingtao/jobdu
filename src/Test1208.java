import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月25日 上午1:17:16
 */
public class Test1208 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			System.out.println(new BigInteger(new StringBuffer(scan
					.nextBigInteger().toString(2)).reverse().toString(), 2)
					.toString(10));
		}
		scan.close();
	}
}
