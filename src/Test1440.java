import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author zyt
 * 
 */
public class Test1440 {

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int count = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (isPrime(i) && isPrime(n - i)) {
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}

}
