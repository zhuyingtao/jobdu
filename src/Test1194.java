import java.util.Scanner;


public class Test1194 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			System.out.println(Integer.toOctalString(n));
		}
		scan.close();
	}
}
