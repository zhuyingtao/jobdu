import java.util.Scanner;

public class Test1016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primeNo = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97, 101, 103, 107, 109, 113 };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			if (a.equals("0") || b.equals("0"))
				break;
			a = new StringBuffer(a).reverse().toString();
			b = new StringBuffer(b).reverse().toString();
			String[] tempA = a.split(",");
			String[] tempB = b.split(",");

			long decimalA = 0;
			long base = 1;
			for (int i = 0; i < tempA.length; i++) {
				base *= primeNo[i];
				if (tempA[i].length() > 1) {
					tempA[i] = new StringBuffer(tempA[i]).reverse().toString();
				}
				decimalA += Integer.parseInt(tempA[i]) * base;
			}
			long decimalB = 0;
			base = 1;
			for (int i = 0; i < tempB.length; i++) {
				base *= primeNo[i];
				if (tempB[i].length() > 1) {
					tempB[i] = new StringBuffer(tempB[i]).reverse().toString();
				}
				decimalB += Integer.parseInt(tempB[i]) * base;
			}

			long sum = decimalA + decimalB;
			StringBuffer str = new StringBuffer();
			for (int i = 1; i < primeNo.length; i++) {
				long remain = sum % primeNo[i];
				sum = sum / primeNo[i];
				if (sum != 0) {
					str.insert(0, "," + remain);
				} else {
					str.insert(0, remain);
					break;
				}
			}
			System.out.println(str);
		}
		scan.close();
	}
}
