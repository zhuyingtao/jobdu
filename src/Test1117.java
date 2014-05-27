import java.util.Arrays;
import java.util.Scanner;

public class Test1117 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[] temp = new int[10];
			int odd = 0;
			int even = 0;
			for (int i = 0; i < 10; i++) {
				int n = scan.nextInt();
				if (n % 2 == 1) {
					temp[odd] = n;
					odd++;
				} else {
					temp[9 - even] = n;
					even++;
				}
			}
			Arrays.sort(temp, 0, (10 - even<0?0:10-even));
			Arrays.sort(temp, odd, 10);

			StringBuffer sb=new StringBuffer();    //用StringBuffer只输出一次
			for (int i = odd-1; i >= 0; i--) {
				sb.append(temp[i] + (i == 0 ? "" : " "));
			}
			for (int i = odd; i < temp.length; i++) {
				sb.append((odd==0?"":" ") + temp[i]);
				odd++;
			}
			System.out.println(sb);
		}
		scan.close();
	}
}
