import java.util.Scanner;


public class Test1000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println(a+b);
			scan.close();
		}
	}
}
