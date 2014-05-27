import java.util.Arrays;
import java.util.Scanner;

public class Test1431 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();
			}
			Arrays.sort(temp);
			int count = 0;
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(temp[i]);
				count++;
				if (count == m)
					break;
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
