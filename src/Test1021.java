import java.util.Scanner;

public class Test1021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println();
		while (!str.equals("#")) {
			char[] ch = str.toCharArray();
			String str2 = scan.nextLine();
			for (int i = 0; i < ch.length; i++) {
				int count = 0;
				for (int j = 0; j < str2.length(); j++) {
					if (str2.charAt(j) == ch[i]) {
						count++;
					}
				}
				System.out.println(ch[i] + " " + count);
			}
			str=scan.nextLine();
		}
		scan.close();
	}
}
