import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1133 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] grade = new int[n];
			int gradeSum=0;
			for (int i = 0; i < n; i++) {
				grade[i] = scan.nextInt();
				gradeSum+=grade[i];
			}
			double sum = 0;
			for (int i = 0; i < n; i++) {
				int score = scan.nextInt();
				double jidian=0;
				if(score>=90&&score<=100){
					jidian=4.0;
				}else if(score>=85&&score<=89){
					jidian=3.7;
				}else if(score>=82&&score<=84){
					jidian=3.3;
				}else if(score>=78&&score<=81){
					jidian=3.0;
				}else if(score>=75&&score<=77){
					jidian=2.7;
				}else if(score>=72&&score<=74){
					jidian=2.3;
				}else if(score>=68&&score<=71){
					jidian=2.0;
				}else if(score>=64&&score<=67){
					jidian=1.5;
				}else if(score>=60&&score<=63){
					jidian=1.0;
				}else{
					jidian=0;
				}
				double jdxf=jidian*grade[i];
				sum+=jdxf;
			}
			double GPA=sum/gradeSum;
			DecimalFormat df=new DecimalFormat("0.00");
			System.out.println(df.format(GPA));
		}
		scan.close();
	}
}
