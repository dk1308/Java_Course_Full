

class Node{
	String data;
	Node next;
	public Node(String x)
	{
		this.data = x;
		this.next = null;
	}
}

class MyStack{
	Node head;
	public MyStack()
	{
		this.head = null;
	}
	public boolean isEmpty() {return (head==null);}
	public String peek()
	{
		return head.data;
	}
	public void push(String x)
	{
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
		
	}
	public String pop()
	{
		Node oldNode = head;
		head = head.next;
		return oldNode.data;
	}
}
