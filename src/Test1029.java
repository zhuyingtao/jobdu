import java.util.ArrayList;
import java.util.Scanner;

public class Test1029 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> commands = new ArrayList<String>();
		String temp = null;
		while (scan.hasNext()) {
			temp = scan.nextLine();
			if (temp.equals("@END@"))
				break;
			commands.add(temp);
		}
		while (scan.hasNext()) {
			int n = Integer.parseInt(scan.nextLine());
			for (int i = 0; i < n; i++) {
				String str = scan.nextLine();
				for (int j = 0; j < commands.size(); j++) {
					String comm = commands.get(j);
					if (comm.contains(str)) {
						if (str.startsWith("[")) {
							System.out.println(comm.substring(comm.indexOf("]") + 2));
						} else {
							System.out.println(comm.substring(1,comm.indexOf("]")));
						}
						break;
					}
					if (j == commands.size() - 1) {
						System.out.println("what?");
					}
				}
			}
		}
		scan.close();
	}
}
