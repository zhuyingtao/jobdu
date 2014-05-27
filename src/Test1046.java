import java.util.Scanner;

public class Test1046 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int max = -999;
			for (int i = 0; i < 10; i++) {
				int n = scan.nextInt();
				if (max < n)
					max = n;
			}
			System.out.println("max="+max);
		}
		scan.close();
	}
}
