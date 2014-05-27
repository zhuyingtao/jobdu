import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Log implements Comparable<Log> {
	String str;
	String name;
	Date date;
	double cost;

	public Log(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
		this.analysis();
	}

	public void analysis() {
		String[] temp = str.split("\\s{2,}");
		this.name = temp[0];
		try {
			this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS")
					.parse(temp[1]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.cost = Double.parseDouble(temp[2].split("[(]")[0]);
		// System.out.println(this.name);
		// System.out.println(this.date);
		// System.out.println(this.cost);
	}

	@Override
	public int compareTo(Log o) {
		// TODO Auto-generated method stub
		if (this.cost < o.cost)
			return -1;
		else if (this.cost > o.cost)
			return 1;
		else {
			if (this.date.before(o.date))
				return -1;
			else if (this.date.after(o.date))
				return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.str;
	}
}

public class Test1130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Log> list = new ArrayList<Log>();
		while (scan.hasNextLine()) {
			String temp = scan.nextLine();
			if (temp.equals("") || temp == null)
				break;
			Log log = new Log(temp);
			list.add(log);
		}
		Collections.sort(list);
		for (Log log : list) {
			System.out.println(log);
		}
		scan.close();
	}
}
