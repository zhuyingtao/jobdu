import java.util.ArrayList;
import java.util.Scanner;

class Worker {
	int id;
	String name;
	int age;
}

public class Test1187 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			ArrayList<Worker> workers = new ArrayList<Worker>();
			for (int i = 0; i < n; i++) {
				Worker w = new Worker();
				w.id = scan.nextInt();
				w.name = scan.next();
				w.age = scan.nextInt();
				workers.add(w);
			}
			for (int j = 0; j < (n > 3 ? 3 : n); j++) {
				int minAge = 100;
				int index = 0;
				int minID = 10000;
				for (int i = 0; i < workers.size(); i++) {
					if (workers.get(i).age < minAge) {
						minAge = workers.get(i).age;
						minID = workers.get(i).id;
						index = i;
					} else if (workers.get(i).age == minAge
							&& workers.get(i).id < minID) {
						minID = workers.get(i).id;
						index = i;
					}
				}
				System.out.println(workers.get(index).id + " "
						+ workers.get(index).name + " "
						+ workers.get(index).age);
				workers.remove(index);
			}
		}
		scan.close();
	}
}
