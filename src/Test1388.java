import java.util.Scanner;

public class Test1388 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long j = 1;
			long k = 2;
			long sum = 0;
			if (n == 1)
				sum = j;
			else if (n == 2)
				sum = k;
			for (int i = 2; i < n; i++) {
				sum = j + k;
				j = k;
				k = sum;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
