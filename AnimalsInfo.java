abstract class Animals{
abstract void cats();
abstract void dogs();

}
class  Cats extends Animals{
void cats(){

System.out.println("cats meow");
}
void dogs(){
	
}


}

 class Dogs extends Animals{

void dogs(){
System.out.println("Dog bark");
}
void cats(){
	
}


}

class AnimalsInfo{
public static void main(String [] args){
Cats c= new Cats();     
c.cats();
Dogs d= new Dogs();
d.dogs();

}
}

