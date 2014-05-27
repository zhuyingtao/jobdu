import java.util.Scanner;

public class Test1036 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			boolean flag = false;
			for (int i = 9; i > 0; i--) {
				for (int j = 9; j>=0; j--) {
					if ((i * 10000 + x * 1000 + y * 100 + z * 10 + j) % n == 0) {
						System.out.println(i + " " + j + " "
								+ (i * 10000 + x * 1000 + y * 100 + z * 10 + j)
								/ n);
						flag = true;
						break;
					}
				}
				if (flag)
					break;
				if(i==1){
					System.out.println("0");
				}
			}
		}
		scan.close();
	}
}
