import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年3月27日 下午9:55:48
 */
public class Test1125 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			BigInteger bi = scan.nextBigInteger();
			if (bi.intValue() == -1)
				break;
			StringBuffer sb = new StringBuffer();
			for (int i = 2; i <= 9; i++) {
				BigInteger temp = new BigInteger(i + "");
				if (bi.mod(temp).intValue() == 0) {
					sb.append(i + " ");
				}
			}
			if (sb.length() == 0)
				sb.append("none");
			else
				sb = sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb);
		}
		scan.close();
	}

}
