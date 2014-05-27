import java.util.Scanner;


public class Test1049 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.next();
			String c=scan.next();
			s=s.replaceAll(c, "");
			System.out.println(s);
		}
		scan.close();
	}
}
