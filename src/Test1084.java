import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年6月18日 下午9:56:55
 */
public class Test1084 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] split = new int[n + 1];
			split[1] = 1;
			for (int i = 2; i <= n; i++) {
				if (i % 2 != 0) {
					// if i is an odd,its split is the same as i-1;
					split[i] = split[i - 1];
				} else {
					// if i is an even,its split has two part:
					// 1:there is no 1,so it is the same as i/2;
					// 2:there is 1,so minus this 1,then it is same as i-1.
					split[i] = (split[i / 2] + split[i - 1]) % 1000000000;
				}
			}
			System.out.println(split[n]);
		}
	}
}
