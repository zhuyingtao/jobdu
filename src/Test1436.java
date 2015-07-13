import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Test1436
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月12日 上午12:35:43
 */
public class Test1436 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int l = scan.nextInt();
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			Arrays.sort(array);
			int count = 0;
			int len = 0;
			for (int i = array.length - 1; i >= 0; i--) {
				if (len < l) {
					count++;
					len += array[i];
				} else
					break;
			}
			if (len < l)
				System.out.println("impossible");
			else
				System.out.println(count);
		}
		scan.close();
	}
}
