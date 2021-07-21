package DSA;

public class Stack extends LinkedList{
	
	Stack (){}
	
	Stack(int data){
		super(data);
	}

	Stack(int[] arr){
		super(arr);
	}
	
	public void print() {
		if (head == null) System.out.println("Stack Empty");
		else {
			System.out.print("Top - ");
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
		System.out.println("- Bottom");
	}

	public void push(int data) {
		super.addFront(data);
	}
	
	public int pop() {
		return super.deleteFront();
	}
	
	public void reverseStack(Stack s) {
		
		if (s.isEmpty()) return;
		int temp = s.pop();
		reverseStack(s);
		insertEnd(s, temp);
		
	}
	
	public void insertEnd(Stack s, int temp) {
		if (s.isEmpty()) {
			s.push(temp);
			return;
		}
		int n = pop();
		insertEnd(s, temp);
		s.push(n);
	}
}

