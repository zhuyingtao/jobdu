import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年4月14日 下午3:59:11
 */


public class Test1009 {


    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node makeTree(String s) {
        Node root = new Node(s.charAt(0) - '0');
        for (int i = 1; i < s.length(); i++) {
            int value = s.charAt(i) - '0';
            insert(value, root);
        }
        return root;
    }

    public static void insert(int value, Node root) {
        Node node = new Node(value);
        Node temp = root;
        while (true)
            if (node.value < temp.value) {
                if (temp.left == null) {
                    temp.left = node;
                    break;
                } else
                    temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = node;
                    break;
                } else
                    temp = temp.right;
            }
    }

    public static boolean find(int value, Node root) {
        Node temp = root;
        while (value != temp.value) {
            if (value < temp.value)
                temp = temp.left;
            else
                temp = temp.right;
            if (temp == null)
                return false;
        }
        return true;
    }

    public static StringBuffer print(Node root) {
        StringBuffer s = new StringBuffer();
        if (root != null) {
            s.append(root.value);
            s.append(print(root.left));
            s.append(print(root.right));
        }
        return s;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            String s = scan.next();
            // build the binary search tree.
            Node root = makeTree(s);
            String s1 = print(root).toString();
            // check every input case.
            for (int i = 0; i < n; i++) {
                String ss = scan.next();
                Node newRoot = makeTree(ss);
                String ss1 = print(newRoot).toString();
                boolean isFind = s1.equals(ss1);
                System.out.println(isFind ? "YES" : "NO");
            }
        }
        scan.close();
    }
}
