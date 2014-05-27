import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test1190 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger[] array = new BigInteger[100];
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				BigInteger bi = scan.nextBigInteger();
				array[i] = bi;
			}

			Arrays.sort(array, 0, n);

			for (int i = 0; i < n; i++) {
				System.out.println(array[i]);
			}
		}
		scan.close();
	}
}
