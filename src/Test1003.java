import java.util.Scanner;

public class Test1003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str1=scan.next();
			String str2=scan.next();
			str1=str1.replace(",", "");
			str2=str2.replace(",", "");
			long a=Integer.parseInt(str1);
			long b=Integer.parseInt(str2);
			System.out.println(a+b);
		}
		scan.close();
	}
}
