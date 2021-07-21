package DSA;

public class CharLinkedList {
	
	public CharNode head;
	public CharNode tail;
	
	CharLinkedList(){}
	
	CharLinkedList(char data){
		this.head = new CharNode(data);
	}
	
	CharLinkedList(char[] arr){
		for (char c:arr) addFront(c);
	}
	
	public void print() {
			
			if (head == null) return;
			CharNode temp = head;
			while (temp != null) {
				System.out.print(temp.data);
				if (temp.next != null) System.out.print("->");
				temp = temp.next;
			}
			System.out.println();
		}

	public void addFront(char data) {
		
		CharNode temp = new CharNode(data);
		if (head == null) head = temp;
		else {
			temp.next = head;
			head = temp;
		}
		
	}
	
	public char deleteFront() {
		if (!isEmpty()) {
			char data = head.data;
			head = head.next;
			return data;
		}
		else return '!';
	}

	public boolean isEmpty() {
		return (head == null)?true:false;
	}

}
