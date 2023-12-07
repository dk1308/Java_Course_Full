import java.util.LinkedList;
import java.util.Queue;

class BSTNodeint {
	int data;
	BSTNodeint left;
	BSTNodeint right;

	public BSTNodeint() {

	}

	public BSTNodeint(int data) {
		this.data = data;
		this.left = this.right = null;
	}

}

class BSTint {
	BSTNodeint root;

	BSTNodeint searchint(int x, ParentNodeint parent) {
		if (root == null)
			return null;
		BSTNodeint s = root;
		while (s != null) {
			parent.itself = s;
			if (s.data > x)
				s = s.left;
			else if (s.data < x)
				s = s.right;
			else
				return s;
		}
		return null;
	}

	void insert(int x) {
		BSTNodeint newNode = new BSTNodeint(x);
		if (root == null) {
			root = newNode;
			return;
		}

		ParentNodeint parent = new ParentNodeint();
		if (searchint(x, parent) != null)
			return;

		if (parent.itself.data > x)
			parent.itself.left = newNode;
		else
			parent.itself.right = newNode;

	}

	void level_order() {
		Queue<BSTNodeint> q = new LinkedList<>();
		q.add(this.root);

		while (!q.isEmpty()) {
			BSTNodeint node = q.remove();
			System.out.print(node.data + " ");

			if (node.left != null)
				q.add(node.left);

			if (node.right != null)
				q.add(node.right);
		}
	}

	BSTNodeint deleteByCopy(BSTNodeint root, int key) {
		if (root == null) {
			return null;
		}

		if (root.data > key) {
			root.left = deleteByCopy(root.left, key);
		} else if (root.data < key) {
			root.right = deleteByCopy(root.right, key);
		} else {
			// node 1 child hoặc 2 child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			// node 2 child, copy min node
			//BSTNodeint temp = minValueNode(root.right);
			//root.data = temp.data;

			// xóa note vừa copy
			//root.right = deleteByCopy(root.right, temp.data);
		}
		return root;
	}

	private BSTNodeint minValueNode(BSTNodeint node) {
		BSTNodeint current = node;

		// find min node (trái cùng)
		while (current.left != null) {
			current = current.left;
		}

		return current;
	}
}

class ParentNodeint {
	BSTNodeint itself;
}

public class test {

	public static void main(String[] args) {
		int[] a = new int[8];
		a[0] = 6;
		a[1] = 2;
		a[2] = 7;
		a[3] = 3;
		a[4] = 8;
		a[5] = 4;
		a[6] = 1;
		a[7] = 5;
		BSTint bst = new BSTint();
		for (int i = 0; i < a.length; i++) {
			bst.insert(a[i]);
		}
		
		
		bst.deleteByCopy(bst.root, 3);
		bst.level_order();
	}
}
