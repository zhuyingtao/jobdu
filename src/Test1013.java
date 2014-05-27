import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1013 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();  // n days
			SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
			for(int i=0;i<n;i++){ 
				int m=scan.nextInt(); // m students
				Date earliest=null;
				Date latest=null;
				String earliestID=null;
				String latestID=null;
				for(int j=0;j<m;j++){
					String id=scan.next();
					Date comeTime=sdf.parse(scan.next());
					Date leaveTime=sdf.parse(scan.next());
					if(j==0){
						earliest=comeTime;
						latest=leaveTime;
						earliestID=id;
						latestID=id;
					}
					if(earliest.after(comeTime)){
						earliest=comeTime;
						earliestID=id;
					}
					if(latest.before(leaveTime)){
						latest=leaveTime;
						latestID=id;
					}
				}
				System.out.println(earliestID+" "+latestID);
			}
		}
		scan.close();
	}
}
