import java.util.Scanner;

public class Test1052 {

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
			int x = scan.nextInt();
			for (int i = 0; i < temp.length; i++) {
				if (x == temp[i]) {
					System.out.println(i);
					break;
				}
				if (i == temp.length - 1)
					System.out.println("-1");
			}
		}
		scan.close();
	}
}
