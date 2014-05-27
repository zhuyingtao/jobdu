import java.util.ArrayList;


public class Test1072 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		ArrayList<Integer> number=new ArrayList<Integer>();
		for(int i=0;i<6;i++){
			for(int j=0;j<5;j++){
				for(int k=0;k<7;k++){
					int sum=i*8+j*10+k*18;
					if(!number.contains(sum)){
						number.add(sum);
						count++;
					}
				}
			}
		}
		System.out.println(count-1);
	}
}
