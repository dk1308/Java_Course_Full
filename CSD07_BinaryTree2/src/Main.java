class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree(int[] arr) {
        root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.left = constructTree(arr, start, mid - 1);
        node.right = constructTree(arr, mid + 1, end);
        return node;
    }

    void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
        printTree(node.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
        System.out.println(node.data);
        printTree(node.left, level + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 4, 5, 15, 7};
        BinaryTree tree = new BinaryTree(arr);
        tree.printTree(tree.root, 0);
    }
}
