package DSA;

public class LinkedList {
	
	public Node head;
	public Node tail;
	
	LinkedList(){}

	LinkedList(int data){
		this.head = new Node(data);
	}
	
	LinkedList(int[] arr){
		for (int i:arr) addFront(i);
	}
	
	public void print() {
			
			if (head == null) return;
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data);
				if (temp.next != null) System.out.print("->");
				temp = temp.next;
			}
			System.out.println();
		}
	
	public void addFront(int data) {
		
		Node temp = new Node(data);
		if (head == null) head = temp;
		else {
			temp.next = head;
			head = temp;
		}	
	}

	public int deleteFront() {
		if (!isEmpty()) {
			int data = head.data;
			head = head.next;
			return data;
		}
		else return -999;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void reverse() {
		
		if (head == null || head.next == null) return;
		LinkedList l2 = new LinkedList();
		
		Node temp = head;
		while (temp != null) {
			l2.addFront(temp.data);
			temp = temp.next;
		}
		this.head = l2.head;
	}

	public void addOne() {
		Node temp = head;
		Node prev = null;
		if (head == null) return;
		
		while (temp!= null) {
			if (temp.data != 9) prev = temp;
			temp = temp.next;
		}
		if (prev == null) {
			prev = head;
			while (prev != null) {
				prev.data = 0;
				prev = prev.next;
			}
			addFront(1);
		}
		else {
			prev.data = prev.data+1;
			prev = prev.next;
			while (prev != null) {
				prev.data = 0;
				prev = prev.next;
			}
		}
	}

	public Node reverseInPlace(Node node) {
		
		if (node == null || node.next == null) return node;
		Node cur = node;
		Node prev = null;
		while (cur != null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
	
	public void fold() {
		if (head == null || head.next == null) return;
		
		Node slow=head, fast=head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node temp = slow.next;
		slow.next = null;
		Node head1 = head;
		Node head2 = reverseInPlace(temp);
		while(head2!=null) {
			Node temp1 = head1.next;
			Node temp2 = head2.next;
			head1.next = head2;
			head2.next = temp1;
			head1 = temp1;
			head2 = temp2;
		}
		print();
	}
}
