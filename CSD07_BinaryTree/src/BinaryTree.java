import java.util.ArrayList;

class node {
    int data;
    node left;
    node right;
    public node(int data) { this.data = data; left = right = null; }
    @Override public String toString() { return data+""; }
}

class BinaryTree {
    node root;
    public BinaryTree() { root = null; }
    public BinaryTree(int[] a) {
        root = null;
        for (int x : a) insert(x);
    }
    
    public void insert(int x) {
        nodeRef parent = new nodeRef();
        node posX = search(x, parent);
        if (posX != null) return; //found x
        node newNode = new node(x);
        if (parent.itself == null) // the tree is empty
            root = newNode; 
        else if (parent.itself.data < x) parent.itself.right = newNode;
        else parent.itself.left = newNode;
    }
    
    public node search(int x, nodeRef parent) {
        node t = root;
        while (t != null) {
            if (t.data == x) // found x
                break;
            
            parent.itself = t; // point to previous node
            
            if (t.data < x) t = t.right;
            else t = t.left;
        }
        return t;
    }
    
    
    public void drawTree(int tabNum)
    {
    	subDrawTree(root, tabNum,' ');
    }
    
    void subDrawTree(node curNode, int tabNum, char LR) {
    	if (curNode==null) return;
		System.out.println(tabStr(tabNum)+LR+" "+curNode+"\n");
		subDrawTree(curNode.left, tabNum+3,'L'); // Preorder: trai truoc 
		subDrawTree(curNode.right, tabNum+3,'R');
    }
    
    String tabStr(int tabNum) {
    	String s="";
    	int i=0;
    	while (i<=tabNum) {
    		s+=" ";
    		i++;
		}
		return s;
    }
    

}

class nodeRef { node itself; }







//public void in_order(ArrayList res) { 
//    in_order(root, res);
//}
//private void in_order(node t, ArrayList res) {
//    if (t == null) return;
//    in_order(t.left, res); // 1 2 3 4
//    // 1 2 3 4 add 5
//    res.add(t.data); // // 1 2 3 4; 5
//    in_order(t.right, res); // 1 2 3 4 5; 6 7 8 9
//}
//public int height() {
//    return height(root);
//}
//private int height(node t) {
//    if (t == null) return 0;
//    int hLeft = height(t.left);
//    int hRight = height(t.right);
//    return Math.max(hLeft, hRight) + 1;
//}
//public ArrayList in_order() { 
//    ArrayList res = new ArrayList();
//    in_order(root, res);
//    return res;
//}
//public double average() {
//    INTEGER s = new INTEGER(0), n = new INTEGER(0);
//    average(root, s, n);
//    return s.itself / (1.0 * n.itself);
//}
//private void average(node t, INTEGER s, INTEGER n) {
//    if (t == null) return ;
//    average(t.left, s, n);
//    average(t.right, s, n);
//    s.itself += t.data; 
//    n.itself ++;
//}
//public static ArrayList tree_sort(int[] a) {
//    ArrayList res = new ArrayList();
//    BinaryTree T = new BinaryTree(a);
//    T.in_order(res);
//    return res;
//}

//class INTEGER { 
//    int itself; 
//    public INTEGER(int itself) {
//        this.itself = itself;
//    }
//}