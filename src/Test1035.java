import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年9月23日 下午2:41:55
 */
public class Test1035 {

	static class Person {
		char name;
		Person parent1;
		Person parent2;
		ArrayList<Person> children;

		public Person(char name) {
			this.name = name;
		}

		public void addChild(Person child) {
			if (children == null)
				children = new ArrayList<Person>();
			children.add(child);
		}

		public void addParent(Person parent) {
			if (parent1 == null)
				parent1 = parent;
			else if (parent2 == null)
				parent2 = parent;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (((Person) obj).name == this.name)
				return true;
			else
				return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			// tooooooooooooooooooooobaaaaddddddd!!!
			ArrayList<Person> persons = new ArrayList<Person>();
			for (int i = 0; i < n; i++) {
				String str = scan.next();
				Person child = new Person(str.charAt(0));
				Person parent1 = str.charAt(1) == '-' ? null : new Person(
						str.charAt(1));
				Person parent2 = str.charAt(2) == '-' ? null : new Person(
						str.charAt(2));
				if (!persons.contains(child))
					persons.add(child);
				if (parent1 != null && !persons.contains(parent1))
					persons.add(parent1);
				if (parent2 != null && !persons.contains(parent2))
					persons.add(parent2);
				child = persons.get(persons.indexOf(child));
				if (parent1 != null) {
					parent1 = persons.get(persons.indexOf(parent1));
				}
				if (parent2 != null) {
					parent2 = persons.get(persons.indexOf(parent2));
				}
				child.addParent(parent1);
				child.addParent(parent2);
				if (parent1 != null)
					parent1.addChild(child);
				if (parent2 != null)
					parent2.addChild(child);
			}
			for (int i = 0; i < m; i++) {

			}
		}
	}
}
