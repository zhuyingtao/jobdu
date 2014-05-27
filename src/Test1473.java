import java.util.Scanner;


/**
 * @author Z.Y.T
 *
 * 2014年4月25日 上午1:28:43
 */
public class Test1473 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			for (int i = 0; i < n; i++) {
				int t=scan.nextInt();
				System.out.println(Integer.toBinaryString(t));
			}
		}
		scan.close();
	}
}
