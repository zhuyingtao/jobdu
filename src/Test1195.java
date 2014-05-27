import java.util.ArrayList;
import java.util.Scanner;

public class Test1195 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> temp = new ArrayList<String>();
		while (scan.hasNext()) {
			temp.add(scan.nextLine());
		}
		int min = 100;
		int max = 0;
		for (int i = 0; i < temp.size(); i++) {
			if (min > temp.get(i).length()) {
				min = temp.get(i).length();
			}
			if (max < temp.get(i).length()) {
				max = temp.get(i).length();
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).length() == min) {
				System.out.println(temp.get(i));
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).length() == max) {
				System.out.println(temp.get(i));
			}
		}
		scan.close();
	}
}
