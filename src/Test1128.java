import java.text.DecimalFormat;
import java.util.Scanner;


public class Test1128 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			float sum=0;
			for(int i=0;i<n;i++){
				sum+=scan.nextInt();
			}
			float average=sum/n;
			System.out.println(new DecimalFormat("0.00").format(average));
		}
		scan.close();
	}
}
