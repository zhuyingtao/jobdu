import java.util.Scanner;

public class Test1111 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.nextLine();
			String Old=scan.nextLine();
			String New=scan.nextLine();
			if(!s.endsWith(Old)){
				Old=Old+" ";
				New=New+" ";
			}
			s=s.replace(Old, New);
			System.out.println(s);
		}
		scan.close();
	}
}
