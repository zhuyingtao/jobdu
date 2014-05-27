import java.util.Arrays;
import java.util.Scanner;

class Stu implements Comparable<Stu> {
	String id;
	int score;

	public Stu(String id, int score) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.score = score;
	}

	public int compareTo(Stu o) {
		// TODO Auto-generated method stub
		if (this.score > o.score)
			return -1;
		else if (this.score < o.score)
			return 1;
		else if (this.score == o.score) {
			if (this.id.compareTo(o.id) < 0)
				return -1;
			else if (this.id.compareTo(o.id) > 0)
				return 1;
		}
		return 0;
	}

	public String toString() {
		return this.id + " " + this.score;
	}
}

public class Test1014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int stu = scan.nextInt();
			if (stu == 0)
				break;
			int question = scan.nextInt();
			int line = scan.nextInt();
			int[] queValue = new int[question];
			for (int i = 0; i < question; i++) {
				queValue[i] = scan.nextInt();
			}
			
			Stu[] qualifiedStu = new Stu[1000];
			int number = 0;
			for (int j = 0; j < stu; j++) {
				String stuID = scan.next();
				int score = 0;
				int complete = scan.nextInt();
				for (int i = 0; i < complete; i++) {
					score += queValue[scan.nextInt() - 1];
				}
				if (score >= line) {
					Stu s = new Stu(stuID, score);
					qualifiedStu[number++] = s;
				}
			}
			
			Arrays.sort(qualifiedStu, 0, number);
			System.out.println(number);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < number; i++) {
				sb.append(qualifiedStu[i].toString()
						+ (i == number - 1 ? "" : "\n"));
			}
			if (number != 0)
				System.out.println(sb);
		}
		scan.close();
	}
}
