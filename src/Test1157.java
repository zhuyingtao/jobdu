import java.util.Arrays;
import java.util.Scanner;

public class Test1157 {

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
			int[] temp = new int[n];
			int middle=0;
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();
			}
			Arrays.sort(temp);
			if (n % 2 == 0) {
				middle=(temp[n/2-1]+temp[n/2])/2;
			}else{
				middle=temp[n/2];
			}
			System.out.println(middle);
		}
		scan.close();
	}
}
