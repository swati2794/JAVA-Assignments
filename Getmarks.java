abstract class Marks{
abstract float getPercentage();

}
class A extends Marks{
	int a;
	int b;
	int c;
A(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
}

float getPercentage(){
float add=(this.a+this.b+this.c);
float percentage=(add/150)*100;
System.out.println(percentage);
return percentage;
}
}


class B extends Marks{
int a;
int b;
int c;
int d;
B(int a,int b,int c,int d){
this.a=a;
this.b=b;
this.c=c;
this.d=d;
}
float getPercentage(){
float add=(this.a+this.b+this.c+this.d);
float percentage=(add/200)*100;
return percentage;
}
}
class Getmarks{
public static void main(String [] args)
{
Marks m= new A(50,46,23);
Marks m1=new B(46,48,42,46);
System.out.println("Percentage of Student A is:"+m.getPercentage());
System.out.println("Percentage of Student A is:"+m1.getPercentage());
}
}