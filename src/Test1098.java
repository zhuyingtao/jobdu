import java.util.Scanner;

public class Test1098 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			char ch = 'A';
			for (int i = 0; i < 26; i++) {
				int count = 0;
				char temp=(char)(ch+i);
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == temp) {
						count++;
					}
				}
				System.out.println(temp + ":" + count);
			}
		}
		scan.close();
	}
}
