import java.util.Scanner;

public class Test1010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s = scan.nextLine();
			s = s.replace(" =", "");
			String[] temp = s.split(" \\+ ");
			if (temp[0].equals("zero") && temp[1].equals("zero"))
				break;
			for (int i = 0; i < temp.length; i++) {
				temp[i] = temp[i].replace(" ", "");
				temp[i] = temp[i].replace("zero", "0");
				temp[i] = temp[i].replace("one", "1");
				temp[i] = temp[i].replace("two", "2");
				temp[i] = temp[i].replace("three", "3");
				temp[i] = temp[i].replace("four", "4");
				temp[i] = temp[i].replace("five", "5");
				temp[i] = temp[i].replace("six", "6");
				temp[i] = temp[i].replace("seven", "7");
				temp[i] = temp[i].replace("eight", "8");
				temp[i] = temp[i].replace("nine", "9");
			}
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			System.out.println(a + b);
		}
		scan.close();
	}
}
