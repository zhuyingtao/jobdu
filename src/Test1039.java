import java.util.Scanner;

public class Test1039 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextLong();
			}
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(array[i] +(i==0?"":" "));
			}
			System.out.println();
		}
		scan.close();
	}
}
