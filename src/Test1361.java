import java.util.Scanner;

public class Test1361 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String[] ss = str.split("\\s+");
			String[] ss1 = new String[ss.length];

			str = new StringBuffer(str).reverse().toString();
			for (int i = 0; i < ss.length; i++) {
				ss1[i] = new StringBuffer(ss[i]).reverse().toString();
				str = str.replace(ss1[i], ss[i]);
			}
			System.out.println(str);
		}
		scan.close();
	}
}
