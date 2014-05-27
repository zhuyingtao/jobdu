import java.math.BigInteger;
import java.util.Scanner;


public class Test1080_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int m=scan.nextInt();
			int n=scan.nextInt();
			BigInteger bi=new BigInteger(scan.next(), m);
			System.out.println(bi.toString(n));
		}
		scan.close();
	}
}
