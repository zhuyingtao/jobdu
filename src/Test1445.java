import java.util.Scanner;

public class Test1445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int result[] = new int[n];
			for (int k = 0; k < n; k++) {
				int num = scan.nextInt();
				int[] mark = new int[num + 1];

				int lines = scan.nextInt();
				int count = 0;
				for (int i = 0; i < lines; i++) {
					int a = scan.nextInt();
					int b = scan.nextInt();
					if (mark[a] == 0 && mark[b] == 0) {
						count++;
						mark[a] = count;
						mark[b] = count;
					} else if (mark[a] == 0) {
						mark[a] = mark[b];
					} else if (mark[b] == 0) {
						mark[b] = mark[a];
					}
				}
				for (int i = 1; i < num + 1; i++) {
					if (mark[i] == 0)
						count++;
				}
				System.out.println(count);
			}
		}
		scan.close();
	}
}
