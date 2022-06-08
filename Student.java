//1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and
 //that of name as "John" by creating an object of the class Student.
 /*class Student{
	 String name;
	 int Roll_no;
	 {
		// you can initialised value here also
		 
	 }
	public static void main(String[] args)
	{
		Student s=new Student();
		s.Roll_no=1;
		s.name="Jonh";
		//System.out.println(s.Roll_no);
		//System.out.println(s.name);
	}
 }*/
 
 
 //2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by
// creating two objects of class 'Student'.
 /*class Student{
	 String name;
	 int Roll_no;
	 String phone_number;
	 String address;
	 Student(String name,int Roll_no,String phone_number,String address){
		 this.name=name;
		 this.Roll_no=Roll_no;
		 this.phone_number=phone_number;
		 this.address=address;
	 }
	 void display(){
		 System.out.println(this.Roll_no+"      "+this.name+"   "+this.address+"   "+this.phone_number);
	 }
	public static void main(String[] args)
	{
		Student s=new Student("Swati",1,"8605520525","pune");
		Student s1=new Student("Aksh",2,"9607776694","dighi");
		System.out.println("Roll_no"+" "+"name"+" "+"address"+" "+"phone_number");
		s.display();
		s1.display();
		
	}
 }*/
 
 //3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class 
 //named 'Triangle' without any parameter in its constructor.
/* import java.lang.Math;
class Triangle{
	static int a=3;
	static int b=4;
	static int c=5;
	public static void main(String [] args){
		int perimeter;
		float s;
		double A;
		perimeter=(a+b+c);
		s=perimeter/2;
		A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Perimeter:"+perimeter);
		System.out.println("Area:"+A);
		
	}
	
}
*/



/*4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class 
named 'Triangle' with constructor having the three sides as its parameters.

import java.lang.Math;
class Triangle{
	 int a;
	 int b;
	 int c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
}
	public static void main(String [] args){
		Triangle t= new Triangle(3,4,5);
		int perimeter=(t.a+t.b+t.c);
		double s=perimeter/2;
		double A=Math.sqrt(s*(s-t.a)*(s-t.b)*(s-t.c));
		System.out.println("Perimeter:"+perimeter);
		System.out.println("Area:"+A);
		
		
		//System.out.println("Area:"+A);
		
	}
	
}


*/


/*
5.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method 
named 'Area' which returns the area and length and breadth passed as parameters to its constructor.

*/



























