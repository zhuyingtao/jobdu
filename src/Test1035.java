import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Test1035
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月2日 下午2:03:13
 */
public class Test1035 {

	static class Relation {
		People root;

		public Relation(People root) {
			// TODO Auto-generated constructor stub
			this.root = root;
		}

		public People getPeople(People p, char id) {
			if (p.id == id) {
				return p;
			} else if (p.parent1 != null) {
				return getPeople(p.parent1, id);
			} else if (p.parent2 != null) {
				return getPeople(p.parent2, id);
			} else
				return null;
		}

		public boolean addRelation(char a, char b, char c) {
			boolean succ = false;
			People p = this.getPeople(root, a);
			if (p != null) {
				if (b != '-') {
					People par1 = this.getPeople(root, b);
					if (par1 == null)
						p.parent1 = new People(b);
					else
						p.parent1 = par1;
				}
				if (c != '-') {
					People par2 = this.getPeople(root, c);
					if (par2 == null)
						p.parent2 = new People(c);
					else
						p.parent2 = par2;
				}
				if (p.parent1 == root || p.parent2 == root)
					root = p;
				succ = true;
			}
			return succ;
		}

		public String findRelation(char a, char b) {
			String relation = "-";

			return relation;
		}
	}

	static class People {
		char id;
		People parent1;
		People parent2;

		public People(char id) {
			// TODO Auto-generated constructor stub
			this.id = id;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return this.id == ((People) obj).id;
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
			if (n == 0 && m == 0)
				break;
			ArrayList<Relation> relations = new ArrayList<Relation>();
			for (int i = 0; i < n; i++) {
				String sa = scan.next();
				char a = sa.charAt(0);
				char b = sa.charAt(1);
				char c = sa.charAt(2);
				boolean succ = false;
				for (int j = 0; j < relations.size(); j++) {
					succ = relations.get(i).addRelation(a, b, c);
					if (succ)
						break;
				}
				if (!succ) {
					Relation re = new Relation(new People(a));
					re.addRelation(a, b, c);
					relations.add(re);
				}
			}

			for (int i = 0; i < m; i++) {
				String sb = scan.next();
			}
		}
		scan.close();
	}
}
