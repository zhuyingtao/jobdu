import java.util.Scanner;


public class Test1055 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			char[] ch=str.toCharArray();
			for (int i = ch.length-1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		scan.close();
	}
}
