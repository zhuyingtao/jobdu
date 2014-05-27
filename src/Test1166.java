import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1166 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int x = scan.nextInt();
			int n = scan.nextInt();
			DecimalFormat df=new DecimalFormat("0.000000");
			double y=x;
			for(int i=1;i<=n;i++){
				y=y*2/3+x/(3*y*y);
			}
			
			System.out.println(df.format(y));
		}
		scan.close();
	}
}
