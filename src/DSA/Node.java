package DSA;

public class Node {

	public int data;
	public Node next;
	
	Node(int data){
		this.data = data;
	}
	
	Node(int data, Node next){
		this(data);
		this.next = next;
	}
	
}

