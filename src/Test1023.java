import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年9月7日 下午7:57:15
 */
public class Test1023 {

	static class Student implements Comparable<Student> {
		String id;
		String name;
		int score;
		int order;

		public Student(String id, String name, int score) {
			super();
			this.id = id;
			this.name = name;
			this.score = score;
		}

		public void compareOrder(int order) {
			this.order = order;
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			if (this.order == 1) {
				return this.id.compareTo(o.id);
			} else if (this.order == 2) {
				if (this.name.equals(o.name)) {
					return this.id.compareTo(o.id);
				}
				return this.name.compareTo(o.name);
			} else if (this.order == 3) {
				if (this.score == o.score) {
					return this.id.compareTo(o.id);
				}
				return this.score - o.score;
			}
			return 0;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.id + " " + this.name + " " + this.score;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			ArrayList<Student> students = new ArrayList<Student>();
			for (int i = 0; i < n; i++) {
				String id = scan.next();
				String name = scan.next();
				int score = scan.nextInt();
				Student stu = new Student(id, name, score);
				stu.compareOrder(m);
				students.add(stu);
			}
			Collections.sort(students);
			count++;
			System.out.println("Case " + count + ":");
			for (int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i).toString());
			}
		}
	}

}
