import java.util.Scanner;

public class Test1058 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		String str="";
		while (scan.hasNext()) {
			str = scan.nextLine();
			for (int i = 3; i >= 0; --i) {
				 sb.append(str.charAt(i));
			}
			sb.append("\n");
		}
		System.out.println(sb);
		scan.close();
	}
}
