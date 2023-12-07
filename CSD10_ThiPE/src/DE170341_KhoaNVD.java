import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

class Student implements Comparable<Student> {
	int id;
	String fullName;
	String yearOfBirth;
	double average;

	public Student(int id, String fullName, String yearOfBirth, double average) {
		this.id = id;
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.average = average;
	}

	@Override
	public String toString() {
		return id + "";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;
		return 0;
	}
}

// Class Node
class BSTNode {
	Student data;
	BSTNode left;
	BSTNode right;

	public BSTNode() {

	}

	public BSTNode(Student data) {
		this.data = data;
		this.left = this.right = null;
	}
}

// Class binary search tree
class BST {
	BSTNode root;

//	function search
	BSTNode search(Student x, ParentNode parent) {
		if (root == null)
			return null;
		BSTNode s = root;
		while (s != null) {
			parent.itself = s;
			if (s.data.compareTo(x) > 0)
				s = s.left;
			else if (s.data.compareTo(x) < 0)
				s = s.right;
			else
				return s;
		}
		return null;
	}

//	function search - return node searched - do not use parent node
	BSTNode search(Student x) {
		if (root==null) return null;
		BSTNode s = root;
		while (s!=null) {
			if (s.data.compareTo(x)>0) s=s.left;
			else if(s.data.compareTo(x)<0) s=s.right;
			else return s;
		}
		return null;
	}
	
	
//	function insert
	void insert(Student x) {
		BSTNode newNode = new BSTNode(x);
		if (root == null) {
			root = newNode;
			return;
		}

		ParentNode parent = new ParentNode();
		if (search(x, parent) != null)
			return;

		if (parent.itself.data.compareTo(x) > 0)
			parent.itself.left = newNode;
		else
			parent.itself.right = newNode;
	}
	
//	function insert 2 - do not use recursion
	void insert2(Student x) {
		if (search(x)!=null) return;
			
		BSTNode newNode = new BSTNode(x);
		BSTNode s = root;
		BSTNode preS = null;
		while (s!=null) {
			preS = s;
			if (s.data.compareTo(x)>0) s=s.left;
			else s=s.right;
		}
		
		if (preS.data.compareTo(x)>0) preS.left = newNode;
		else preS.right = newNode;
	}

//	function display the tree in level order
	void level_order() {
		Queue<BSTNode> q = new LinkedList<>();
		q.add(this.root);

		while (!q.isEmpty()) {
			BSTNode node = q.remove();
			System.out.print(node.data + " ");

			if (node.left != null)
				q.add(node.left);

			if (node.right != null)
				q.add(node.right);
		}
	}

//	function display the tree in descending order
	void traverse_desc(BSTNode node) {
		if (node.right != null) {
			traverse_desc(node.right);
		}
		System.out.print(node.data + " ");
		if (node.left != null) {
			traverse_desc(node.left);
		}
	}
	
//	function find student by average
	int findStdByAverage(BSTNode node) {
		int count =0;
		Student s = node.data;
		if (s.average<5) 
			count++;
		if (node.left != null) {
			count+=findStdByAverage(node.left);
		}
		if (node.right != null) {
			count+=findStdByAverage(node.right);
		}
		return count;
	}
	
//	function delete student by age - use delete a node by copy
	void delectStdByAge(int age, BSTNode node) {
		Date currentDate = new Date(System.currentTimeMillis());
		if (currentDate.getYear() +1900 - Integer.parseInt(node.data.yearOfBirth) == age) {
			deleteByCopy(root, node.data);
		}
		if (node.left!=null) delectStdByAge(age, node.left);
		if (node.right!=null) delectStdByAge(age, node.right);
	}
	
//	function delete a node by copy
	BSTNode deleteByCopy(BSTNode root, Student key) {
	    if (root == null) {
	        return null;
	    }
	 
	    if (root.data.compareTo(key)>0) {
	        root.left = deleteByCopy(root.left, key);
	    } else if (root.data.compareTo(key)<0) {
	        root.right = deleteByCopy(root.right, key);
	    } else {
	        // node with only one child or no child
	        if (root.left == null) {
	            return root.right;
	        } else if (root.right == null) {
	            return root.left;
	        }
	        
	        
	        // node with two children, copy the inorder successor's data to this node
	        BSTNode temp = minValueNode(root.right);
	        root.data = temp.data;
	        
	        // delete the inorder successor
	        root.right = deleteByCopy(root.right, temp.data);
	    }
	    return root;
	}
	
	BSTNode deleteNode(BSTNode root, Student key) /*cung la delete by copy nhung khong su dung de quy*/{
		BSTNode parent = null; // nút cha của node cần xóa
		BSTNode current = root; // nút hiện tại đang xét
	    boolean isLeftChild = false; // xác định node cần xóa có phải là con trái hay không
	    
	    // tìm node cần xóa và nút cha của nó
	    while (current != null && current.data != key) {
	        parent = current;
	        if (key.compareTo(current.data)<0) {
	            current = current.left;
	            isLeftChild = true;
	        } else {
	            current = current.right;
	            isLeftChild = false;
	        }
	    }
	    
	    // nếu không tìm thấy node cần xóa
	    if (current == null) {
	        return root;
	    }
	    
	    // trường hợp node cần xóa không có con bên phải
	    if (current.right == null) {
	        if (parent == null) {
	            root = current.left;
	        } else if (isLeftChild) {
	            parent.left = current.left;
	        } else {
	            parent.right = current.left;
	        }
	    }
	    
	    // trường hợp node cần xóa có con bên phải nhưng không có con bên trái
	    else if (current.left == null) {
	        if (parent == null) {
	            root = current.right;
	        } else if (isLeftChild) {
	            parent.left = current.right;
	        } else {
	            parent.right = current.right;
	        }
	    }
	    
	    // trường hợp node cần xóa có cả hai con
	    else {
	        // tìm node kế cận (phải nhất trong cây con trái của node cần xóa)
	    	BSTNode successor = current.left;
	    	BSTNode successorParent = current;
	        while (successor.right != null) {
	            successorParent = successor;
	            successor = successor.right;
	        }
	        
	        // copy giá trị của node kế cận lên node cần xóa
	        current.data = successor.data;
	        
	        // xóa node kế cận
	        if (successorParent.right == successor) {
	            successorParent.right = successor.left;
	        } else {
	            successorParent.left = successor.left;
	        }
	    }
	    return root;
	}
	 
//	function find the most left node at the right branch
	private BSTNode minValueNode(BSTNode node) {
		BSTNode current = node;
	 
	    // find the leftmost leaf
	    while (current.left != null) {
	        current = current.left;
	    }
	 
	    return current;
	}
	
	BSTNode rotateLeft(BSTNode root) {
		BSTNode newRoot = root.right;
	    root.right = newRoot.left;
	    newRoot.left = root;
	    return newRoot;
	}

	// hàm xoay phải
	BSTNode rotateRight(BSTNode root) {
		BSTNode newRoot = root.left;
	    root.left = newRoot.right;
	    newRoot.right = root;
	    return newRoot;
	}
}

class ParentNode {
	BSTNode itself;
}


public class DE170341_KhoaNVD {
	public static void main(String[] args) {
		Student[] a = new Student[10];
//		a[0] = new Student(7, "1", "2004", 5);
//		a[1] = new Student(9, "1", "2002", 4);
//		a[2] = new Student(15, "1", "2004", 8);
//		a[3] = new Student(3, "1", "2003", 6);
//		a[4] = new Student(10, "1", "2005", 9);
//		a[5] = new Student(5, "1", "2004", 4);
//		a[6] = new Student(12, "1", "2003", 3);
//		a[7] = new Student(4, "1", "2003", 7);
//		a[8] = new Student(8, "1", "2004", 10);
//		a[9] = new Student(11, "1", "2002", 3);
		// insert
//		for (int i = 0; i < a.length; i++) {
//			bst.insert(a[i]);
//		}
		
		
		BST bst = new BST(); //Declare the tree
		bst.insert(new Student(5, "Tai", "2003", 2.0));
		bst.insert(new Student(3, "Hung", "2004", 9.0));
		bst.insert2(new Student(2, "Quan", "2002", 3.0));
		bst.insert(new Student(4, "Khoa", "2003", 9.0));
		bst.insert2(new Student(7, "Hoang", "2004", 4.0));
		bst.insert2(new Student(6, "Tu", "2003", 9.0));
		bst.insert2(new Student(8, "Anh", "2005", 4.0));
		bst.insert(new Student(1, "Khanh", "2003", 9.0));
		bst.insert2(new Student(9, "Phuong", "2009", 9.0));
		
		// display in level order
		bst.level_order();
		
		// traverse descending order
		System.out.println();
		bst.traverse_desc(bst.root);
		
		// find the number of student having average less than 5
		System.out.println();
		int res = bst.findStdByAverage(bst.root);
		System.out.println(res);
		

//		bst.deleteByCopy(bst.root, a[2]);
		
		// delect student whose age equals to 19
		System.out.println("delete:");
		bst.delectStdByAge(19, bst.root);
		bst.level_order();
	}
}