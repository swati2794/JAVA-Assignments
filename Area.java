abstract class Shape
{
abstract  float rectanglearea(float a, float b);
abstract  double squarearea(float l);
abstract double circlearea(float r);
}

class Area 
{
	float rectanglearea(float a, float b)
	{
		float Areaofreactangle=a*b;
		return Areaofreactangle;
	}
	double squarearea(double l){

		double Areaofsquare=4*l;
		return Areaofsquare;
	}

	double circlearea(double r){
		double Areaofcircle= 3.14f*r*r;
		return Areaofcircle;
	
	}
	
	public static void main(String [] args){
		Area a= new Area();
		
		a.squarearea(5.0);
		a.circlearea(3.0);
		System.out.println("Area of rectangle"+a.rectanglearea(5.5f,3.2f));
		System.out.println("Area of square"+a.squarearea(5.2));
		System.out.println("Area of circle"+a.circlearea(3.1));
	}

}