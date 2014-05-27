import java.math.BigInteger;
import java.util.Scanner;

public class Test1076 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			BigInteger bi = new BigInteger("1");
			for (int i = 1; i <= n; i++) {
				bi = bi.multiply(new BigInteger("" + i));
			}
			System.out.println(bi);
		}
		scan.close();
	}
}
