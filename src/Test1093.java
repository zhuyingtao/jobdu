import java.util.Scanner;

public class Test1093 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] keyboard = { '`', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'0', '-', '=', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
				'P', '[', ']', '\\', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K',
				'L', ';', '\'', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.',
				'/'};
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String temp = scan.nextLine();
			StringBuffer sb = new StringBuffer(temp);
			for (int i = 0; i < temp.length(); i++) {
				char a = temp.charAt(i);
				for (int j = 0; j < keyboard.length; j++) {
					if (a == keyboard[j]) {
						a = keyboard[j - 1];
						break;
					}
				}
				sb.setCharAt(i, a);
			}
			System.out.println(sb.toString());
		}
		scan.close();
	}
}
