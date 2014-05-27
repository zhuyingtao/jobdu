import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014-4-7 下午9:35:37
 */
public class Test1138 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			BigInteger bi = scan.nextBigInteger();
			System.out.println(bi.toString(2));
		}
		scan.close();
	}
}
