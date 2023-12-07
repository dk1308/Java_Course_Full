import java.util.LinkedList;
import java.util.Queue;

class Worker {
	private int key;
	private String name;
	private int age;

	public Worker(int key, String name, int age) {
		this.key = key;
		this.name = name;
		this.age = age;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return key + " | " + name + " | " + age;
	}
}

class Node {
	Worker data;
	Node left;
	Node right;
	boolean isLeftMostAtRow;

	public Node(Worker data) {
		this.data = data;
		this.left = this.right = null;
		this.isLeftMostAtRow=false;
	}
	
	public Node() {}
}

class ParentNode {
	Node itself;
}

class BST {
	Node root;

//	Question 1
	Node findNode(int key, ParentNode parent) {
		if (root == null)
			return null;
		Node s = root;
		while (s != null) {
			parent.itself = s;
			if (s.data.getKey() < key)
				s = s.right;
			else if (s.data.getKey() > key)
				s = s.left;
			else
				return s;
		}
		return null;
	}

//	Question 2
	void insertNode(Worker newWorker) {
		Node newNode = new Node(newWorker);
		if (root == null) root = newNode;
		ParentNode parent = new ParentNode();
		if (findNode(newWorker.getKey(), parent) != null)
			return;
		if (parent.itself.data.getKey() < newWorker.getKey())
			parent.itself.right = newNode;
		else if (parent.itself.data.getKey() > newWorker.getKey())
			parent.itself.left = newNode;
	}

//	Question 3	
	void outputDesc(Node node) {
		if (root == null)
			return;
		if (node.right != null) {
			outputDesc(node.right);
		}
		System.out.println(node.data);
		if (node.left != null) {
			outputDesc(node.left);
		}
	}
	
//	Question 4
	int countWorkerAgeLess25(Node node) {
		int count =0;
		Worker w = node.data;
		if (w.getAge()<25) 
			count++;
		if (node.left != null) {
			count+=countWorkerAgeLess25(node.left);
		}
		if (node.right != null) {
			count+=countWorkerAgeLess25(node.right);
		}
		return count;
	}

//	Question 5
	void deleteRightMostNode() {
		Node rightMost = root;
		Node preRightMost = new Node();
		while (rightMost.right!=null) {
			preRightMost = rightMost;
			rightMost= rightMost.right;
		}
		if (rightMost.left== null) preRightMost.right = null;
		else preRightMost.right = rightMost.left;
	}
	
//	Question 6
	int height() {
		int height = 0;
		root.isLeftMostAtRow = true;
		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		
		while (!q.isEmpty()) {
//			if (q.peek()==null) return height;
			Node node = q.remove();
			if (node == null) {
				height++;
				continue;
			}
			
			if (node.isLeftMostAtRow== true) q.add(null);
			
			if (node.left != null && node.isLeftMostAtRow==true) {
				node.left.isLeftMostAtRow=true;
				q.add(node.left);
			} else if (node.left != null) 
				q.add(node.left);

			if (node.right != null)
				q.add(node.right);
		}
		return height;
	}
	
	
//	Question 7
	BST buildLargestHeightTree(Worker[] list) {
		if (list== null) return null;
		list = sortListAsc(list);
		BST T = new BST();
		for (int i = 0; i < list.length; i++) {
			T.insertNode(list[i]);
		}
		return T;
	}
	
	Worker[] sortListAsc(Worker[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = list.length-1; j > i; j--) {
				if (list[j].getKey() < list[j-1].getKey()) {
					Worker temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}
			}
		}
		return list;
	}
}

public class ManageWorkerByTree {
	public static void main(String[] args) {
		Worker[] arrayWorker = new Worker[7];
		arrayWorker[0] = new Worker(5, null, 26);
		arrayWorker[1] = new Worker(6, null, 0);
		arrayWorker[2] = new Worker(7, null, 5);
		arrayWorker[3] = new Worker(9, null, 30);
		arrayWorker[4] = new Worker(1, null, 26);
		arrayWorker[5] = new Worker(3, null, 24);
		arrayWorker[6] = new Worker(8, null, 25);
		
		BST T = new BST();
		ParentNode parent = new ParentNode();
		parent.itself = T.root;
		for (int i = 0; i < arrayWorker.length; i++) {
			T.insertNode(arrayWorker[i]);
		}
		
		System.out.println("Search node 9: "+T.findNode(9, parent).data
				);
		T.outputDesc(T.root);
		System.out.println("Count worker whose age less than 25: "+T.countWorkerAgeLess25(T.root));
		
		T.deleteRightMostNode();
		
		System.out.println("Ban đầu: "+T.height());
		
		T = T.buildLargestHeightTree(arrayWorker);
		System.out.println("Cây dài nhất: "+T.height());
	}
}
