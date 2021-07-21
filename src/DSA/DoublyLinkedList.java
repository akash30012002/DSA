package DSA;

public class DoublyLinkedList {

	public DoubleNode head;
	
	DoublyLinkedList(){}
	
	DoublyLinkedList(int data){
		this.head = new DoubleNode(data);
	}
	
	public void addFront(int data) {
		if (head == null) {
			this.head = new DoubleNode(data);
			return;
		}
		DoubleNode newNode = new DoubleNode(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void addEnd(int data) {
		if (head == null) {
			this.head = new DoubleNode(data);
			return;
		}
		DoubleNode newNode = new DoubleNode(data);
		DoubleNode temp = head;
		while (temp.next != null) temp = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	public int deleteFront() {
		if (isEmpty()) return -999;
		int temp = head.data;
		head = head.next;
		head.prev = null;
		return temp;
	}
	
	public int deleteEnd() {
		
		if (head == null) return -999;
		
		if (head.next == null) return deleteFront();
		
		else {
			DoubleNode temp = head;
			while (temp.next.next != null) temp = temp.next;
			int data = temp.next.data;
			temp.next = null;
			return data;
		}
	}
	
	public void addBefore(int data, int newData) {
		DoubleNode temp = head;
		
		if (temp == null) {
			return;
		}
		
		while (temp != null) {
			if (temp.data == data) break;
		    temp = temp.next;
		}
		
		if (temp == null) {
			System.out.println(data + " does not exist"); 
			return;
		}
		
		if (temp == head) {
			addFront(newData);
		}
		
		else {
			DoubleNode newNode = new DoubleNode(newData);
			DoubleNode prev = temp.prev;
			prev.next = newNode;
			newNode.prev = prev;
			newNode.next = temp;
			temp.prev = newNode;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
}

