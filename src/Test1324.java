import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @ClassName Test1324
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月9日 下午10:06:05
 */
public class Test1324 {

	static class Student {
		String id;
		int scoreC;
		int scoreM;
		int scoreE;
		int scoreA;

		int rankC;
		int rankM;
		int rankE;
		int rankA;

		public Student(String id, int scoreC, int scoreM, int scoreE) {
			this.id = id;
			this.scoreC = scoreC;
			this.scoreM = scoreM;
			this.scoreE = scoreE;
			this.scoreA = (scoreC + scoreM + scoreE) / 3;
		}

		public int getScore(int type) {
			if (type == 1)
				return this.scoreA;
			else if (type == 2)
				return this.scoreC;
			else if (type == 3)
				return this.scoreE;
			else
				return this.scoreM;
		}

		public void setRank(int type, int rank) {
			if (type == 1) {
				this.rankA = rank;
			} else if (type == 2) {
				this.rankC = rank;
			} else if (type == 3) {
				this.rankE = rank;
			} else
				this.rankM = rank;
		}

		public String getBest() {
			if (rankA <= rankC && rankA <= rankM && rankA <= rankE)
				return rankA + " " + "A";
			if (rankC <= rankA && rankC <= rankM && rankC <= rankE)
				return rankC + " " + "C";
			if (rankM <= rankA && rankM <= rankC && rankM <= rankE)
				return rankM + " " + "M";
			if (rankE <= rankC && rankE <= rankM && rankE <= rankA)
				return rankE + " " + "E";
			return null;
		}
	}

	public static void sort(Student[] stu, final int type) {
		Arrays.sort(stu, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				int score1 = 0;
				int score2 = 0;
				switch (type) {
				case 1:
					score1 = o1.scoreA;
					score2 = o2.scoreA;
					break;
				case 2:
					score1 = o1.scoreC;
					score2 = o2.scoreC;
					break;
				case 3:
					score1 = o1.scoreE;
					score2 = o2.scoreE;
					break;
				case 4:
					score1 = o1.scoreM;
					score2 = o2.scoreM;
					break;
				}
				if (score1 > score2)
					return -1;
				else if (score1 == score2)
					return 0;
				else
					return 1;
			}
		});

		int rank = 0;
		int score = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getScore(type) == score) {
				stu[i].setRank(type, rank);
			} else {
				stu[i].setRank(type, i + 1);
				score = stu[i].getScore(type);
				rank = i + 1;
			}
		}
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			Student[] stu = new Student[n];
			for (int i = 0; i < n; i++) {
				String id = scan.next();
				int scoreC = scan.nextInt();
				int scoreM = scan.nextInt();
				int scoreE = scan.nextInt();
				stu[i] = new Student(id, scoreC, scoreM, scoreE);
			}

			for (int i = 1; i < 5; i++) {
				sort(stu, i);
			}
			for (int i = 0; i < m; i++) {
				String id = scan.next();
				for (int j = 0; j < stu.length; j++) {
					if (id.equals(stu[j].id)) {
						System.out.println(stu[j].getBest());
						break;
					}
					if (j == stu.length - 1) {
						System.out.println("N/A");
					}
				}
			}
		}
		scan.close();
	}
}
