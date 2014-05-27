import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1062 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double n = scan.nextDouble();
			double ans=0;
			if(n>=0&&n<2){
				ans=-n+2.5;
			}else if(n>=2&&n<4){
				ans=2-1.5*(n-3)*(n-3);
			}else if(n>=4&&n<6){
				ans=n/2-1.5;
			}
			DecimalFormat df=new DecimalFormat("0.000");
			System.out.println(df.format(ans));
		}
		scan.close();
	}
}
