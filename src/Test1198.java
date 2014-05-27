import java.math.BigInteger;
import java.util.Scanner;


public class Test1198 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String a=scan.next();
			String b=scan.next();
			BigInteger a1=new BigInteger(a);
			BigInteger b1=new BigInteger(b);
			System.out.println(a1.add(b1));
		}
		scan.close();
	}
}
