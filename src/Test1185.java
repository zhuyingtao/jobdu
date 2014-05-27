import java.util.Arrays;
import java.util.Scanner;

public class Test1185 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] temp = new int[n];
			int max = -9999;
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();
				if (max < temp[i])
					max = temp[i];
			}
			Arrays.sort(temp);
			System.out.println(max);
			if (temp.length == 1) {
				System.out.println("-1");
			} else {
				for (int i = 0; i < temp.length - 1; i++) {
					System.out.print((i == 0 ? "" : " ") + temp[i]);
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
