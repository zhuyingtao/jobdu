import java.util.Scanner;

class Student2 {
	String id;
	String name;
	String sex;
	int age;
}

public class Test1069 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			Student2[] s = new Student2[n];
			for (int i = 0; i < n; i++) {
				s[i] = new Student2();
				s[i].id = scan.next();
				s[i].name = scan.next();
				s[i].sex = scan.next();
				s[i].age = scan.nextInt();
			}
			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				String id = scan.next();
				for (int j = 0; j < s.length; j++) {
					if (id.equals(s[j].id)) {
						System.out.println(s[j].id + " " + s[j].name + " "
								+ s[j].sex + " " + s[j].age);
						break;
					}
					if(j==s.length-1){
						System.out.println("No Answer!");
					}
				}
			}
		}
		scan.close();
	}
}
