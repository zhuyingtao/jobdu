import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午7:34:35
 */
public class Test1465 {

	/**
	 * @param args
	 */
	public static int realNum(int[] array) {
		int realNum = 0;
		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			for (int j = 0; j < array.length; j++) {
				if (i == j)
					continue;
				int b = array[j];
				if (a / b < 1) {
					if (!findCommonDivisor(a, b))
						realNum++;
				}
			}
		}
		return realNum;
	}

	public static boolean findCommonDivisor(int a, int b) {
		boolean flag = false;
		int min = a < b ? a : b;
		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			int realNum = realNum(array);
			System.out.println(realNum);
		}
		scan.close();
	}
}
