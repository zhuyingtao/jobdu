import java.util.Scanner;

public class Test1183 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (("" + n * n).endsWith("" + n)) {
				System.out.println("Yes!");
			} else
				System.out.println("No!");
		}
		scan.close();
	}
}
