import java.util.Scanner;

public class Test1175 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			if (b.length() < 5) {
				for (int i = 1; i < 9; i++) {
					String temp = b.replace(b.charAt(0),
							(char) (b.charAt(0) + i));
					int index = a.indexOf(temp);
					if (index != -1) {
						System.out.println("YES");
						break;
					}
					if (i == 8) {
						System.out.println("NO");
					}
				}
			} else {
				boolean flag = false;
				for (int i = 1; i < 5; i++) {
					if (flag)
						break;
					for (int j = 0; j < 5; j++) {   //正则表达式 效率低
						int index = a.indexOf((char) (b.charAt(j) + i));
						if (index == -1)
							break;
						if (j == 4) {
							System.out.println("YES");
							flag = true;
						}
					}
				}
				if (flag == false) {
					System.out.println("NO");
				}
			}
		}
		scan.close();
	}
}
