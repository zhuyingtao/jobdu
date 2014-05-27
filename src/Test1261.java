import java.util.Scanner;

public class Test1261 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();
			}
			if (temp[0] >= temp[1]) {
				if (temp[0] > temp[n - 1]) {
					System.out.println(temp[0]);
				} else
					System.out.println(temp[n - 1]);
			} else if (temp[0] <= temp[1]) {
				for (int i = 0; i < n; i++) {
					if ((i == n - 1) || (i < n - 1 && temp[i] > temp[i + 1])) {
						System.out.println(temp[i]);
						break;
					}
				}
			}
		}
		scan.close();
	}
}
