import java.util.Stack;

class Node {
	String data;
	Node next;

	public Node(String x) {
		this.data = x;
		this.next = null;
	}

	@Override
	public String toString() {
		return data + " ";
	}
}


// Build Queue
class MyQueue {
	Node head, tail;
	public MyQueue() {
		head = null;
	}
	public boolean isEmpty(){return (head == null);}
	public void enQueue(String x) {
		Node newNode = new Node(x);
		if (isEmpty()) head=newNode;
		else tail.next=newNode;
		tail = newNode;
	}
	public String deQueue()
	{
		String oldNode = head.data.trim();
		head = head.next;
		return oldNode;
	}
	@Override
	public String toString() {
		String s="";
		for (Node t = head; t!=null ; t=t.next) {
			s+= t;
		}
		return s;
	}
}


//Build Stack
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
		String oldNode = head.data.trim();
		head = head.next;
		return oldNode;
	}
}

	

public class ConvertInfix {
	public static int precedence(String s) {
		if (s.equals("*") || s.equals("/"))
			return 2;
		else if (s.equals("+") || s.equals("-"))
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		String infix = "( ( ( 5 + 3 ) * 4 ) + 10 * 3 ) / 15";
		String[] tokens = infix.split(" ");
		Stack<String> s = new Stack<>();
		MyQueue suffix = new MyQueue();

		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.equals("("))
				s.push(token);
			else if (token.equals(")")) {
				while (!s.isEmpty() && !s.peek().equals("("))
					suffix.enQueue(s.pop()+" ");
				s.pop();
			} else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				while (!s.isEmpty() && precedence(token) <= precedence(s.peek()))
					suffix.enQueue(s.pop()+" ");
				s.push(token);
			} else
				suffix.enQueue(token+" ");
		}
		while (!s.isEmpty())
			suffix.enQueue(s.pop() + " ");
		System.out.println(suffix);
		
		
		Stack<Double> S2 = new Stack<>();
        while (!suffix.isEmpty()) {
            String token = suffix.deQueue();
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                double b = S2.pop(); double a = S2.pop();
                double result;
                if(token.equals("+")) result = a+b;
                else if(token.equals("-")) result = a-b;
                else if(token.equals("*")) result = a*b;
                else // "/")
                    result = a/b;
                S2.push(result);
            } else 
                S2.push(Double.parseDouble(token));
        }
        System.out.println("The VALUE of " + infix + " IS \n" + S2.pop());
        double x = ( ( ( 5 + 3 ) * 4 ) + 10 * 3 ) / 15;
        System.out.println("By Java is " + x);
	}
}
