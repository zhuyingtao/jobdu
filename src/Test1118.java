import java.math.BigInteger;
import java.util.Scanner;


public class Test1118 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int a=scan.nextInt();
			String s=scan.next();
			int b=scan.nextInt();
			BigInteger bi=new BigInteger(s, a);
			System.out.println(bi.toString(b).toUpperCase());
		}
		scan.close();
	}
}
