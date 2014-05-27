import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			@SuppressWarnings("unused")
			int p = scan.nextInt();
			int t = scan.nextInt();
			int g1 = scan.nextInt();
			int g2 = scan.nextInt();
			int g3 = scan.nextInt();
			int gj = scan.nextInt();
			double result = 0;
			if (Math.abs(g1 - g2) <= t) {
				result = (g1 + g2) / 2.0;
			} else if (Math.abs(g3 - g1) <= t && Math.abs(g3 - g2) <= t) {
				result=Math.max(g3, Math.max(g1, g2));
			}else if(Math.abs(g3 - g1) <= t || Math.abs(g3 - g2) <= t){
				if(Math.abs(g3-g1)>=Math.abs(g3-g2)){
					result=(g3+g2)/2.0;
				}else{
					result=(g3+g1)/2.0;
				}
			}else{
				result=gj;
			}
			DecimalFormat df=new DecimalFormat("0.0");
			System.out.println(df.format(result));
		}
		scan.close();
	}
}
