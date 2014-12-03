import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年10月16日 下午7:52:50
 */
public class Test1040 {

	public static boolean isPrimeNumber(int number) {
		int dive = (int) Math.sqrt(number);
		for (int i = 2; i <= dive; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int count = 0;
			int i = 2;
			while (count < n) {
				boolean isPrime = isPrimeNumber(i++);
				if (isPrime)
					count++;
			}
			System.out.println(i-1);
		}
	}
}
