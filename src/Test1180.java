import java.util.Scanner;


public class Test1180 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int[][] matrix=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=scan.nextInt();
				}
			}
			boolean sym=true;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					if(matrix[i][j]!=matrix[j][i]){
						sym=false;
					}
				}
			}
			System.out.println(sym?"Yes!":"No!");
		}
		scan.close();
	}
}
