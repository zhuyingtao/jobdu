import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Applicants implements Comparable<Applicants> {
	int id;
	int GE;
	int GI;
	int[] choices;
	int school = -1;
	int order = -1;

	public Applicants(int id, int GE, int GI, int[] choices) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.GE = GE;
		this.GI = GI;
		this.choices = choices;
	}

	public int getChoice(int i) {
		return choices[i];
	}

	@Override
	public int compareTo(Applicants o) {
		// TODO Auto-generated method stub
		double score1 = (this.GE + this.GI) / 2.0;
		double score2 = (o.GE + o.GI) / 2.0;
		if (score1 > score2)
			return 1;
		else if (score1 < score2)
			return -1;
		else if (score1 == score2) {
			if (this.GE > o.GE)
				return 1;
			else if (this.GE < o.GE)
				return -1;
		}
		return 0;
	}
}

public class Test1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int stuNo = scan.nextInt();
			int schoolNo = scan.nextInt();
			int choiceNo = scan.nextInt();
			int[] quota = new int[schoolNo];
			Applicants[] all = new Applicants[stuNo];
			for (int i = 0; i < schoolNo; i++) {
				quota[i] = scan.nextInt();
			}
			for (int i = 0; i < stuNo; i++) {
				int GE = scan.nextInt();
				int GI = scan.nextInt();
				int[] ch = new int[choiceNo];
				for (int j = 0; j < choiceNo; j++) {
					ch[j] = scan.nextInt();
				}
				Applicants ap = new Applicants(i, GE, GI, ch);
				all[i] = ap;
			}
			Arrays.sort(all);

			Applicants[] minScore = new Applicants[schoolNo];
			for (int i = all.length - 1; i >= 0; i--) {
				for (int j = 0; j < choiceNo; j++) {
					Applicants app = all[i];
					int choice = app.getChoice(j);
					if (quota[choice] > 0) {
						app.school = choice;
						app.order = j;
						quota[choice]--;
						minScore[choice] = app;
						break;
					} else if (quota[choice] == 0) {
						if (app.compareTo(minScore[choice]) == 0
								&& j == minScore[choice].order) {
							app.school = choice;
							break;
						}
					}
				}
			}

			for (int i = 0; i < schoolNo; i++) {
				StringBuffer sb = new StringBuffer();
				ArrayList<Integer> admit = new ArrayList<Integer>();
				for (int j = 0; j < all.length; j++) {
					if (all[j].school == i) {
						admit.add(all[j].id);
					}
				}
				Collections.sort(admit);
				for (int j = 0; j < admit.size(); j++) {
					sb.append(admit.get(j) + (j == admit.size() - 1 ? "" : " "));
				}
				System.out.println(sb);
			}
		}
		scan.close();
	}
}
