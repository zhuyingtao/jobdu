import java.util.Scanner;

public class Test1092 {

	static int fib(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(fib(n));
		}
		scan.close();
	}
}
