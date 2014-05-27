import java.util.Arrays;
import java.util.Scanner;

class Student1 implements Comparable<Student1> {
	String name;
	int age;
	int score;

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		if (this.score < o.score)
			return -1;
		else if (this.score > o.score)
			return 1;

		if (this.name.compareTo(o.name) < 0)
			return -1;
		else if (this.name.compareTo(o.name) > 0)
			return 1;

		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;

		return 0;
	}
}

public class Test1061 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			Student1[] s=new Student1[n];
			for(int i=0;i<n;i++){
				s[i]=new Student1();
				s[i].name=scan.next();
				s[i].age=scan.nextInt();
				s[i].score=scan.nextInt();
			}
			Arrays.sort(s);
			StringBuffer result=new StringBuffer();
			for(int i=0;i<n;i++){
				result.append(s[i].name+" "+s[i].age+" "+s[i].score+"\n");
			}
			System.out.print(result);
		}
		scan.close();
	}
}
