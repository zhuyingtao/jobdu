import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zyt
 * 
 * @since 2014年12月3日 下午9:15:44
 */
public class Test1357 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		while (scan.hasNext()) {
			long k = scan.nextLong();
			double m = Math.sqrt(1 + 8.0 * k) / 2 - 0.5;
			long result=(long) m+(m>(long)m?1:0);
			System.out.println(result);
		}
		scan.close();
	}
}
