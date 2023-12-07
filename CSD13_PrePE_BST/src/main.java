
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class node {
    int data;
    node left;
    node right;
    public node(int data) { this.data = data; left = right = null; }
    @Override public String toString() { return data+""; }
}
class bst {
    node root;
    public bst() { root = null; }
    public bst(int[] a) {
        root = null;
        for (int x : a) insert(x);
    }
    public void insert(int x) {
        nodeRef parent = new nodeRef();
        node posX = search(x, parent);
        if (posX != null) return;
        // not found x
        node newNode = new node(x);
        if (parent.itself == null) // the tree is empty
            root = newNode; 
        else if (parent.itself.data < x) parent.itself.right = newNode;
        else parent.itself.left = newNode;
    }
    public node search(int x, nodeRef parent) {
        node t = root; parent.itself = null;
        while (t != null) {
            if (t.data == x) // found x
                break;
            // truoc khi di xuong duoi thi luu lai
            parent.itself = t;
            // re xuong duoi
            if (t.data < x) t = t.right;
            else t = t.left;
        }
        return t;
    }
    public void in_order(ArrayList res) { 
        in_order(root, res);
    }
    private void in_order(node t, ArrayList res) {
        if (t == null) return;
        in_order(t.left, res); // 1 2 3 4
        // 1 2 3 4 add 5
        res.add(t.data); // // 1 2 3 4; 5
        in_order(t.right, res); // 1 2 3 4 5; 6 7 8 9
    }
    public int height() {
        return height(root);
    }
    private int height(node t) {
        if (t == null) return 0;
        int hLeft = height(t.left);
        int hRight = height(t.right);
        return Math.max(hLeft, hRight) + 1;
    }
    
    
   
    
    int height2() {
    	Queue<node> q = new LinkedList<>();
    	q.add(root);
    	int height =0;
    	while(!q.isEmpty()) {
    		
    		node r = q.remove();
    		
    		if (r.left!=null) {
    			q.add(r.left);
    		}
        	
        	if (r.right!=null) {
    			q.add(r.right);
    		}
    	}
    	
    	
    	return 0;
    }
    
    public ArrayList in_order() { 
        ArrayList res = new ArrayList();
        in_order(root, res);
        return res;
    }
    public double average() {
        INTEGER s = new INTEGER(0), n = new INTEGER(0);
        average(root, s, n);
        return s.itself / (1.0 * n.itself);
    }
    private void average(node t, INTEGER s, INTEGER n) {
        if (t == null) return ;
        average(t.left, s, n);
        average(t.right, s, n);
        s.itself += t.data; 
        n.itself ++;
    }
}
class INTEGER { 
    int itself; 
    public INTEGER(int itself) {
        this.itself = itself;
    }
}
class nodeRef { node itself; }
public class main {
    public static void main(String[] args) {
        bst T = new bst(new int[]{5, 9, 4, 2, 8, 7, 1, 6, 3});
        System.out.println("Inorder traversal = " + T.in_order());
        System.out.println("The average is " + T.average());
        System.out.println("The high is " + T.height());
//        System.out.println("The high is " + T.height2());
//System.out.println("Sorted: " + tree_sort(new int[]{5, 9, 4, 2, 8, 7, 1, 6, 3}));
    }
    public static ArrayList tree_sort(int[] a) {
        ArrayList res = new ArrayList();
        bst T = new bst(a);
        T.in_order(res);
        return res;
    }
}