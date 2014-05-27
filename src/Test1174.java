import java.util.Arrays;
import java.util.Scanner;

public class Test1174 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				temp[i] = scan.nextInt();
			}
			int k = scan.nextInt();

			Arrays.sort(temp);
			int index = 0;
			int number = -1;
			for (int i = 0; i < n; i++) {
				if (number == temp[i])
					continue;
				else {
					number = temp[i];
					index++;
				}
				if (index == k)
					break;
			}
			System.out.println(number);
		}
		scan.close();
	}
}
