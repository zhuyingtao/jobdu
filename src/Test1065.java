import java.util.Scanner;


public class Test1065 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int m=n+2*(n-1);
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(j<m-(n+2*i)){
						sb.append(" ");
					}else{
						sb.append("*");
					}
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}
}
