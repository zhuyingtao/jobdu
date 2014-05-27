import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月6日 下午3:01:44
 */
public class Test1145 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[] pre = new int[n];
			int[] now = new int[n];
			for (int i = 0; i < n; i++) {
				pre[i] = scan.nextInt();
				now[i] = pre[i];
			}

			int count = 0;
			int num = 0;
			boolean flag = true;
			while (flag) {
				for (int i = 0; i < n; i++) {
					int next = (i + 1) % n;
					pre[i] = pre[i] / 2;
					now[next] = now[next] / 2 + pre[i];
				}
				for (int i = 0; i < n; i++) {
					if (now[i] % 2 == 1)
						now[i]++;
					pre[i] = now[i];
				}
				count++;
				for (int i = 0; i < n; i++) {
					if (i == n - 1) {
						flag = false;
						num = now[0];
						break;
					}
					if (now[i] != now[i + 1])
						break;
				}
			}
			System.out.println(count + " " + num);
		}
		scan.close();
	}
}
