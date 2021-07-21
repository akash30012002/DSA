package DSA;

public class DoubleNode {

	public int data;
	public DoubleNode next;
	public DoubleNode prev;
	
	DoubleNode(int data){
		this.data = data;
	}
	
	DoubleNode(int data, DoubleNode prev, DoubleNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}
