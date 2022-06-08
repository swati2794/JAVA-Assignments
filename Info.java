

interface Mammal{
void m1();					// buy default abstract and public 
}

interface Marine{
void m2();

}
class BlueWhale implements Mammal,Marine{
public void m1(){
System.out.println("I am mammal");
}
public void m2(){
System.out.println("I am marine");
}
		
public void m3(){
System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
}
}

class Info{

public static void main(String [] args)
{
//Mammal m=new Mammal();  // not possible
//m.m1();

//Marine mar= new Marine();   // not possible
//mar.m2();

BlueWhale b= new BlueWhale();
b.m1();
b.m2();
b.m3();


//Mammal mamal= new BlueWhale();    
//mamal.m2();


Marine marine= new BlueWhale();
//marine.m1();
marine.m2();
//marine.m3();
}

}