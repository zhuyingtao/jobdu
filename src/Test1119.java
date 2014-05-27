import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月21日 下午4:04:27
 */
public class Test1119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BigInteger sum = new BigInteger("0");
		while (scan.hasNext()) {
			BigInteger bi = scan.nextBigInteger();
			if (bi.intValue() == 0)
				break;
			sum = sum.add(bi);
		}
		System.out.println(sum);
		scan.close();
	}
}
