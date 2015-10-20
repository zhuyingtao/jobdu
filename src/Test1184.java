import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年4月11日 下午8:10:00
 */


public class Test1184 {

    static class Node {
        Node left;
        Node right;
        char value;
    }

    public static String s;

    public static Node makeTree() {
        char value = s.charAt(0);
        s = s.substring(1);
        if (value == '#')
            return null;
        Node n = new Node();
        n.value = value;
        n.left = makeTree();
        n.right = makeTree();
        return n;
    }

    public static void inOrder(Node n) {
        if (n.left != null)
            inOrder(n.left);
        System.out.print(n.value + " ");
        if (n.right != null)
            inOrder(n.right);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            s = scan.next();
            Node n = makeTree();
            inOrder(n);
            System.out.println();
        }
        scan.close();
    }

}
