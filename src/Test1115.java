import java.util.Scanner;

public class Test1115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				int temp = scan.nextInt();
				if (temp < a) {
					sum += temp;
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
