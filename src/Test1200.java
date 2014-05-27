import java.util.Scanner;

public class Test1200 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int[][] temp = new int[4][5];
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 5; k++) {
						temp[j][k] = scan.nextInt();
					}
				}
				int[][] index = new int[2][5];
				for (int j = 0; j < 5; j++) {
					int first = -10000;
					int second = -10000;
					int firstIndex = 0;
					int secondIndex = 0;
					for (int k = 0; k < 4; k++) {
						if (temp[k][j] > first) {
							second=first;
							secondIndex=firstIndex;
							first = temp[k][j];
							firstIndex = k;
						} else if (temp[k][j] > second) {
							second = temp[k][j];
							secondIndex = k;
						}
					}
					if (firstIndex < secondIndex) {
						index[0][j] = firstIndex;
						index[1][j] = secondIndex;
					}else{
						index[0][j]=secondIndex;
						index[1][j]=firstIndex;
					}
				}
				for(int j=0;j<2;j++){
					for(int k=0;k<5;k++){
						int row=index[j][k];
						System.out.print(temp[row][k]+" ");
					}
					System.out.println();
				}
			}
		}
		scan.close();
	}
}
