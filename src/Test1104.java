import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014-4-7 下午9:48:31
 */
public class Test1104 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			BigInteger a = scan.nextBigInteger();
			BigInteger bi = new BigInteger("1");
			for (int i = 2; i <= n; i++) {
				bi = bi.multiply(new BigInteger(i + ""));
			}
			int count=0;
			while(bi.mod(a).intValue()==0){
				count++;
				bi=bi.divide(a);
			}
			System.out.println(count);
		}
		scan.close();
	}
}
