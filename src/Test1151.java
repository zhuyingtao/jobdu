import java.util.Scanner;


public class Test1151 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			for(int i=0;i<2*n;i++){
				short a=scan.nextShort();
				short b=scan.nextShort();
				for(int j=1;j<=32;j++){
					if(a<<j==b){
						System.out.println("YES");
						break;
					}
					if(j==32){
						System.out.println("NO");
					}
				}
			}
		}
		scan.close();
	}
}
