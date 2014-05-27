import java.util.Scanner;

public class Test1168 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		while (scan.hasNext()) {
			String temp = scan.nextLine();
			System.out.println(temp.replaceAll("(?i)"+s, "").replaceAll(" ", ""));
		}
		scan.close();
	}
}
