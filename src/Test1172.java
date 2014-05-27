import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月14日 下午7:09:16
 */
public class Test1172 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			int sum = 0;
			for (int i = 1; i < array.length; i++) {
				Arrays.sort(array, i - 1, array.length);
				array[i] = array[i - 1] + array[i];
				sum += array[i];
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
