import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1148 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double sum = 0;
			for (int i = 0; i < 12; i++) {
				sum += scan.nextDouble();
			}
			double average = sum / 12;
			System.out.println("$" + new DecimalFormat("0.00").format(average));
		}
		scan.close();
	}
}
