import java.util.Scanner;

public class Test1390 {

	/*
	 * 把长条n*2的覆盖问题分解，第一步，若竖着覆盖一个2*1的方块，那么剩下的为2*（n-1)块，
	 * 否则，若横着覆盖，应用两块，覆盖一个2*2的块，剩下2*（n-2），这两种覆盖的方式都各有一种
	 * 于是，这个问题等同于递归f(n)=f(n-1)+f(n-2)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long[] f = new long[100];
			f[0] = 1;
			f[1] = 1;
			for (int i = 2; i <= 70; i++) {
				f[i] = f[i - 1] + f[i - 2];
			}

			System.out.println(f[n]);
		}
		scan.close();
	}
}
