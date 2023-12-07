
class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class MyLinkedList {
	Node head, tail;
	public MyLinkedList() {
		this.head = this.tail = null;
	}
	
	public boolean isEmpty() {
		return this.head ==null;
	}
	
	public void addToHead(int x) {
		Node newNode = new Node(x);
		if (!isEmpty()) {
			newNode.next=head;
			head = newNode;
		} else head = tail = newNode;
	}
	
	public void addToTail(int x) {
		Node newNode = new Node(x);
		if (!isEmpty()) {
			tail.next = newNode;
			tail = newNode;
		} else head = tail = newNode;
	}
	
	public void addAfter(Node p , int x)
	{
		Node newNode = new Node(x);
		Node i = tail;
		while (i!=tail) {
			i.next = i;
		}
		newNode = i.next;
	}
}
