abstract class Abstract{
abstract void a_method();

 void non_abstarct(){
 System.out.println("This is normal method of abstract class");
 }
 
Abstract(){
System.out.println("This is constructor of abstarct class");
}

}

class Subclass extends Abstract{

void a_method(){
System.out.println("This is abstract method");
}

}

class Abstract_Class{
	public static void main(String [] args){
	Abstract a=new Subclass();
	a.a_method();
	a.non_abstarct();
}
}
