import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年4月14日 下午9:29:07
 */


public class Test1201 {


    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node makeBST(int[] array) {
        Node root = new Node(array[0]);
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
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
            } else if (node.value > temp.value) {
                if (temp.right == null) {
                    temp.right = node;
                    break;
                } else
                    temp = temp.right;
            } else {
                break;
            }
    }

    public static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
            Node root = makeBST(array);

            preOrder(root);
            System.out.println();
            inOrder(root);
            System.out.println();
            postOrder(root);
            System.out.println();
        }
        scan.close();
    }
}
