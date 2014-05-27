import java.text.DecimalFormat;
import java.util.Scanner;


public class Test1068 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			double x0=scan.nextDouble();
			double y0=scan.nextDouble();
			double z0=scan.nextDouble();
			double x1=scan.nextDouble();
			double y1=scan.nextDouble();
			double z1=scan.nextDouble();
			double r=Math.sqrt(Math.pow(x0-x1, 2)+Math.pow(y0-y1, 2)+Math.pow(z0-z1, 2));
			double v=Math.acos(-1)*Math.pow(r, 3)*4/3;
			DecimalFormat df=new DecimalFormat("0.000");
			System.out.println(df.format(r)+" "+df.format(v));
		}
		scan.close();
	}
}
