import java.util.Scanner;

public class Test1182 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			int len=str.length();
			
			if(str.charAt(len-1)=='.'){
				System.out.println(len-1);
			}else{
				System.out.print(len+" ");
			}		
		}
		scan.close();
	}
}
