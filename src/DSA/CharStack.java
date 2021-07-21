package DSA;

public class CharStack extends CharLinkedList{

	CharStack (){}
	
	CharStack(char data){
		super(data);
	}

	CharStack(char[] arr){
		super(arr);
	}
	
	public void print() {
		if (head == null) System.out.println("Stack Empty");
		else {
			System.out.print("Top - ");
			CharNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
		System.out.println("- Bottom");
	}

	public void push(char data) {
		super.addFront(data);
	}
	
	public char pop() {
		return super.deleteFront();
	}
	
	public static boolean checkBrackets(String expression) {
		
		CharStack s = new CharStack();
		for (int i = 0; i<expression.length(); i++) {
			if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
				s.push(expression.charAt(i));
			}
			if (expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']') {
				if (s.isEmpty()) return false;
				
				char poppedChar = s.pop();
				if (expression.charAt(i) == ')' && poppedChar != '(') return false;
				if (expression.charAt(i) == '}' && poppedChar != '{') return false;
				if (expression.charAt(i) == ']' && poppedChar != '[') return false;
			}
		}		
		return s.isEmpty(); // takes care of the missing brackets
	}

}
