import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
	int id;
	int score;

	public Student(int id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.score > o.score)
			return 1;
		else if (this.score < o.score)
			return -1;
		else if (this.score == o.score) {
			if (this.id > o.id)
				return 1;
			if (this.id < o.id)
				return -1;
		}
		return 0;
	}
	
	public String toString(){
		return this.id+" "+this.score;
	}
}

public class Test1196 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			Student[] stu=new Student[n];
			for (int i = 0; i < n; i++) {
				int id = scan.nextInt();
				int score = scan.nextInt();
				Student s=new Student(id, score);
				stu[i]=s;
			}
			Arrays.sort(stu);
			
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<n;i++){
				sb.append(stu[i].toString()+"\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}
}
