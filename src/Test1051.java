import java.math.BigInteger;
import java.util.Scanner;

public class Test1051 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int n = scan.nextInt();
			BigInteger sum = new BigInteger("0");
			String temp = a + "";
			for (int i = 1; i <= n; i++) {
				sum = sum.add(new BigInteger(temp));
				temp = temp.concat(a + "");
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
