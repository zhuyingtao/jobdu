import java.util.Scanner;


public class Test1179 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			long sum1=0;
			long sum2=0;
			for(int i=1;i<=n;i++){
				long temp=1;
				for(int j=1;j<=i;j++){
					temp=temp*j;
				}
				if(i%2==0){
					sum2+=temp;
				}else{
					sum1+=temp;
				}
			}
			System.out.println(sum1+" "+sum2);
		}
		scan.close();
	}
}
