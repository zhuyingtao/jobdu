import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月22日 上午11:39:19
 */
class Team implements Comparable<Team> {

	String name;
	int num;
	int punish;

	public Team(String name, int num, int punish) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.num = num;
		this.punish = punish;
	}

	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		if (this.num < o.num)
			return 1;
		else if (this.num > o.num)
			return -1;
		else {
			if (this.punish < o.punish)
				return -1;
			else if (this.punish > o.punish)
				return 1;
			else
				return this.name.compareTo(o.name);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

public class Test1339 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			Team[] teams = new Team[n];
			for (int i = 0; i < n; i++) {
				String name = scan.next();
				int num = scan.nextInt();
				int punish = scan.nextInt();
				Team team = new Team(name, num, punish);
				teams[i] = team;
			}
			Arrays.sort(teams);
			for (Team team : teams) {
				System.out.println(team);
			}
		}
		scan.close();
	}
}
