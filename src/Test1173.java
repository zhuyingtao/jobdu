import java.util.Scanner;

public class Test1173 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] temp = new int[n];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = scan.nextInt();
			}
			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				int a = scan.nextInt();
				for (int j = 0; j < temp.length; j++) {
					if (temp[j] == a) {
						System.out.println("YES");
						break;
					}
					if(j==temp.length-1){
						System.out.println("NO");
					}
				}
			}
		}
		scan.close();
	}
}
