package helloWorld;

public class Product {
	
	int id;
	String type;
	static int x;
	Packaging packaging = Packaging.sachet;
	
	static {
		x = 10;
	}
	
	Product(){
		
	}
	
	Product(Product p){
		this.id = p.id;
		this.type = p.type;
	}
	
	Product(int _id, String _type){
		this.id = _id;
		this.type = _type;
	}
	
	Product(String _type, int _id){
		this.id = _id;
		this.type = _type;
	}
	
	public void setParams() {
		x = 20;
		type = "Soap";
	}
	
	public static class innerClass{
		
		int a;
		String b;
		
		innerClass(int a, String b){
			this.a = a;
			this.b = b;
		}
	}

	
}            
             