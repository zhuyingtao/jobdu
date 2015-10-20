import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年4月11日 下午5:01:44
 */


public class Test1078 {

    static class Node {
        Node left;
        Node right;
        char value;
    }

    public static Node getRoot(String pre, String mid) {
        if (pre.length() == 0)
            return null;
        Node t = new Node();
        char root = pre.charAt(0);
        int pos = mid.indexOf(root);

        String preLeft = pre.substring(1, pos + 1);
        String preRight = pre.substring(pos + 1);
        String midLeft = mid.substring(0, pos);
        String midRight = mid.substring(pos + 1);

        t.value = root;
        t.left = getRoot(preLeft, midLeft);
        t.right = getRoot(preRight, midRight);
        return t;
    }

    public static void postOrder(Node t) {
        if (t.left != null)
            postOrder(t.left);
        if (t.right != null)
            postOrder(t.right);
        System.out.print(t.value);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String pre = scan.next();
            String mid = scan.next();
            Node t = getRoot(pre, mid);
            postOrder(t);
            System.out.println();
        }
        scan.close();
    }
}
