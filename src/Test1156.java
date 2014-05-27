import java.util.Scanner;

public class Test1156 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			@SuppressWarnings("unused")
			int m = scan.nextInt();
			int[] book = new int[n];
			for (int i = 0; i < book.length; i++) {
				book[i] = scan.nextInt();
			}

			for (int i = 0; i < book.length; i++) {
				int a = book[i];
				int sum = -1;
				for (int j = 0; j < book.length; j++) {
					if (a == book[j])
						sum++;
				}
				if (sum == 0) {
					System.out.println("BeiJu");
				} else {
					System.out.println(sum);
				}
			}
		}
		scan.close();
	}
}
