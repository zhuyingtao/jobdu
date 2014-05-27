import java.util.Scanner;

public class Test1116 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String[] s = str.split(" ");
			int a = Integer.parseInt(s[0]);
			String op = s[1];
			int b = 0;
			if (!op.equals("!")) {
				b = Integer.parseInt(s[2]);
			}

			switch (op) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				if (b == 0)
					System.out.println("error");
				else
					System.out.println((double) a / b);
				break;
			case "%":
				if (b == 0)
					System.out.println("error");
				else
					System.out.println(a % b);
				break;
			case "!":
				long sum = 1;
				for (int i = 1; i <= a; i++)
					sum *= i;
				System.out.println(sum);
				break;
			}
		}
		scan.close();
	}
}
