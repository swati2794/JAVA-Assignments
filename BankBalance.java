/*
Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
Call this method by creating an object of each of the three classes.*/

abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance(){
		System.out.println("Your balance is:$100 ");
	}
}
class BankB extends Bank{
	void getBalance(){
		System.out.println("Your balance is:$150 ");
	}
}
class BankC extends Bank{
	void getBalance(){
		System.out.println("Your balance is:$200 ");
	}
}

class BankBalance{
	public static void main(String [] args){
		Bank b=new BankA();
		Bank b1=new BankB();
		Bank b2=new BankC();
		b.getBalance();
		b1.getBalance();
		b2.getBalance();
		
		
	}
}