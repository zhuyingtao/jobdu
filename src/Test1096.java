import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Test1096 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		while(scan.hasNext()){
			String s1=scan.next();
			String s2=scan.next();
			try {
				Date d1=sdf.parse(s1);
				Date d2=sdf.parse(s2);
				long diff=Math.abs(d1.getTime()-d2.getTime());
				long day=diff/(1000*60*60*24);
				System.out.println(day+1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		scan.close();
	}
}
