import java.util.Scanner;

public class Test1389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] array = new long[51];
		array[0] = 1;
		array[1] = 1;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 2; i <=n; i++) {
				long sum = 0;
				for (int j = 0; j < i; j++) {
					sum += array[j];
				}
				array[i] = sum;
			}
			System.out.println(array[n]);
		}
		scan.close();
	}
}
