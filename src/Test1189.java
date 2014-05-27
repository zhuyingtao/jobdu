/**
 * @author Z.Y.T
 * 
 *         2014年4月29日 下午4:22:08
 */
class rNode {
	int data;
	rNode next;
	boolean deleted;

	public rNode(int i) {
		// TODO Auto-generated constructor stub
		this.data = i;
		this.deleted = false;
	}
}

public class Test1189 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rNode head = new rNode(1);
		rNode node = head;
		for (int i = 2; i <= 21; i++) {
			node.next = new rNode(i);
			node = node.next;
		}
		node.next = head;

		node = head;
		int count = 0;
		int delNum = 0;
		while (delNum != 20) {
			if (!node.deleted)
				count++;
			if (count == 17) {
				node.deleted = true;
				delNum++;
				count = 0;
			}
			node = node.next;
		}
		while (node.deleted)
			node = node.next;
		System.out.println(node.data);
	}
}
