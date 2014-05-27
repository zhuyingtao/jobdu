import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午9:54:55
 */
public class Test1483 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int min = 1000001;
			int max = -1000001;
			for (int i = 0; i < n; i++) {
				int temp = scan.nextInt();
				if (temp < min)
					min = temp;
				if (temp > max)
					max = temp;
			}
			System.out.println(max + " " + min);
		}
		scan.close();
	}
}
