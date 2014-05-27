import java.util.Scanner;


public class Test1193 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int[][] temp=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					temp[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(temp[j][i]+(j==n-1?"":" "));
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
