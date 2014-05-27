import java.util.ArrayList;
import java.util.Scanner;

public class Test1107 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int k = scan.nextInt();
				temp.add(k);
			}
			int sum = 0;
			while (temp.size() != 1) {
				int min1 = Integer.MAX_VALUE;
				int min2 = Integer.MAX_VALUE;
				int min1Index = 0;
				int min2Index = 0;
				for (int i = 0; i < temp.size(); i++) {
					if (min1 > temp.get(i)) {
						min1 = temp.get(i);
						min1Index = i;
					}
					if (min2 > min1) {
						int k = min2;
						int k1 = min2Index;
						min2 = min1;
						min2Index = min1Index;
						min1 = k;
						min1Index = k1;
					}
					if (i == temp.size() - 1) {
						temp.remove(min1Index);
						temp.remove(temp.indexOf(min2));
					}
				}
				int min = min1 + min2;
				temp.add(min);
				sum += min;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
