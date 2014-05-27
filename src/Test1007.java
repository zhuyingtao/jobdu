import java.util.Arrays;
import java.util.Scanner;

class Nation implements Comparable<Nation> {
	int id;
	int gold;
	int medal;
	int population;
	int sortMethod = 0;
	int bestMethod = 0;
	int bestRank = 999;
	int realRank = 0;    //每次排序的真实排名

	public Nation(int id, int gold, int medal, int population) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.gold = gold;
		this.medal = medal;
		this.population = population;
	}

	public void setMethod(int sortMethod) {
		this.sortMethod = sortMethod;
	}

	@Override
	public int compareTo(Nation o) {
		// TODO Auto-generated method stub
		if (sortMethod == 0) {
			if (this.gold < o.gold)
				return 1;
			else if (this.gold > o.gold)
				return -1;
		} else if (sortMethod == 1) {
			if (this.medal < o.medal)
				return 1;
			else if (this.medal > o.medal)
				return -1;
		} else if (sortMethod == 2) {
			double goldpop = (double) gold / population;
			double goldpop2 = (double) o.gold / o.population;
			if (goldpop < goldpop2)
				return 1;
			else if (goldpop > goldpop2)
				return -1;
		} else if (sortMethod == 3) {
			double medpop = (double) medal / population;
			double medpop2 = (double) o.medal / o.population;
			if (medpop < medpop2)
				return 1;
			else if (medpop > medpop2)
				return -1;
		} else if (sortMethod == 11) {
			if (this.id < o.id)
				return -1;
			else if (this.id > o.id)
				return 1;
		}
		return 0;
	}

	public String toString() {
		return (this.bestRank + 1) + ":" + (this.bestMethod + 1);
	}
}

public class Test1007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			Nation[] nations = new Nation[n];
			for (int i = 0; i < n; i++) {
				int gold = scan.nextInt();
				int medal = scan.nextInt();
				int population = scan.nextInt();
				Nation na = new Nation(i, gold, medal, population);
				nations[i] = na;
			}
			Nation[] temp = new Nation[m];
			for (int i = 0; i < m; i++) {
				int k = scan.nextInt();
				temp[i] = nations[k];
			}

			for (int i = 0; i < 4; i++) {
				//按给定方法排序
				for (int j = 0; j < temp.length; j++) {
					temp[j].setMethod(i);
				}
				Arrays.sort(temp);
				//解决并列排名问题
				for (int j = 0; j < temp.length; j++) {
					if (j == 0) {
						temp[j].realRank=0;
						continue;
					}
					if (temp[j].compareTo(temp[j - 1]) == 0) {
						temp[j].realRank = temp[j - 1].realRank;
					} else {
						temp[j].realRank = j;
					}
				}
				//给定最佳排序和最佳方法
				for (int j = 0; j < temp.length; j++) {
					if (temp[j].realRank < temp[j].bestRank) {
						temp[j].bestRank = temp[j].realRank;
						temp[j].bestMethod = i;
					}
				}
			}
			
			//按id顺序输出
			for (int i = 0; i < temp.length; i++) {
				temp[i].setMethod(11);
			}
			Arrays.sort(temp);
			for (int i = 0; i < temp.length; i++) {
				System.out.println(temp[i]);
			}
			System.out.println();
		}
		scan.close();
	}
}
