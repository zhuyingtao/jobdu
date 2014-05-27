import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月27日 下午7:08:55
 */
public class Test1489 {

	/**
	 * @param args
	 */
	public static int[][] matrixMultiply(int[][] array1, int[][] array2) {
		int num1 = array1.length;
		int num2 = array2.length;
		int[][] temp = new int[num1][num1];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				int sum = 0;
				for (int k = 0; k < num2; k++) {
					sum += array1[i][k] * array2[k][j];
				}
				temp[i][j] = sum;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[][] array1 = new int[2][3];
			int[][] array2 = new int[3][2];
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					array1[i][j] = scan.nextInt();
				}
			}
			for (int i = 0; i < array2.length; i++) {
				for (int j = 0; j < array2[i].length; j++) {
					array2[i][j] = scan.nextInt();
				}
			}
			int[][] array3 = matrixMultiply(array1, array2);
			for (int i = 0; i < array3.length; i++) {
				for (int j = 0; j < array3[i].length; j++) {
					System.out.print(array3[i][j]
							+ (j == array3[i].length - 1 ? "" : " "));
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
