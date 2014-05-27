import java.util.Scanner;

public class Test1018 {

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
			int[] scores = new int[n];
			for (int i = 0; i < n; i++) {
				scores[i] = scan.nextInt();
			}
			int score = scan.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (scores[i] == score)
					sum++;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
