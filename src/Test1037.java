import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ClassName Test1037
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月2日 下午1:40:44
 */
public class Test1037 {

	/** 
	* @Title: main 
	* @Description: TODO 
	* @param args 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			BigInteger ba=scan.nextBigInteger();
			BigInteger bb=scan.nextBigInteger();
			System.out.println(ba.add(bb));
			System.out.println(ba.subtract(bb));
			System.out.println(ba.multiply(bb));
		}
		scan.close();
	}
}
