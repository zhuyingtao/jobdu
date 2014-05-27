import java.io.BufferedInputStream;
import java.util.Scanner;

public class Test1170 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[][] array = new int[n][2];
			int xmin = 10000;
			int ymin = 10000;
			int index = 0;
			for (int i = 0; i < n; i++) {
				array[i][0] = scan.nextInt();
				array[i][1] = scan.nextInt();
				if (array[i][0] < xmin) {
					xmin = array[i][0];
				}

				if (array[i][0] == xmin && array[i][1] < ymin) {
					ymin = array[i][1];
					index = i;
				}
			}
			System.out.println(array[index][0] + " " + array[index][1]);
		}
		scan.close();
	}
}
