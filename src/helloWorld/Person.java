package helloWorld;

public class Person {
	   private String name;
	   private String surname = " Verma";
	   int a = 10;

	   Person(String name) {
	       this.name = name;
//	       this.surname = surname;
	   }
	   
	   public String getName() {
		   return this.name + this.surname;
	   }
	   
}

class Employee extends Person{
	   
	   public int id;
	   public String surname;

	   public Employee(String name, String surname, int id) {
		   super (name);
		   this.surname = surname;
		   this.id = id;
	   }
	   
//	   public String getName() {
//		   return super.getName();
//	   }
	   
}