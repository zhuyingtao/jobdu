import java.util.Scanner;

public class Test1191 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int[][] temp = new int[m][n];
			for (int i = 0; i < m; i++) {
				int sum = 0;
				int max = 0;
				int maxIndex = 0;
				for (int j = 0; j < n; j++) {
					temp[i][j] = scan.nextInt();
					if (max < temp[i][j]) {
						max = temp[i][j];
						maxIndex = j;
					}
					sum += temp[i][j];
				}
				temp[i][maxIndex] = sum;
			}
			
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(temp[i][j] + (j == n - 1 ? "" : " "));
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}
}
