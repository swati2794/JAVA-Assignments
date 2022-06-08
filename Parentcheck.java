abstract class Parent{
	abstract void message();
}
class Subclass1 extends Parent{
	void message(){
		System.out.println("This is firstclass");
	}
}
class Subclass2 extends Parent{
	void message(){
		System.out.println("This is secondclass");
	}
	
}
class Parentcheck{
	public static void main(String[] args){
		Subclass1 s1= new Subclass1();
		s1.message();
		Subclass2 s2= new Subclass2();
		s2.message();
		
	}
}