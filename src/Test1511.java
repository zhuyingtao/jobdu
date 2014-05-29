import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 上午12:41:47
 */
public class Test1511 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (i != -1) {
			list.add(i);
			i = scan.nextInt();
		}
		Iterator<Integer> iterator=list.descendingIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		scan.close();
	}

}
