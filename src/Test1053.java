import java.util.Scanner;

public class Test1053 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] array = new int[n];
			int max = 0;
			int min = 0;
			int maxIndex = 0;
			int minIndex = 0;

			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
				if (i == 0) {
					max = array[i];
					min = array[i];
				}
				if (array[i] > max) {
					max = array[i];
					maxIndex = i;
				} else if (array[i] < min) {
					min = array[i];
					minIndex = i;
				}
			}
			int temp = array[maxIndex];
			array[maxIndex] = array[minIndex];
			array[minIndex] = temp;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ((i==array.length-1)?"":" "));
			}
			System.out.println();
		}
		scan.close();
	}
}
