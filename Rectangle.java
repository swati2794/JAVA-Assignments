 class Rectangle{
	int l;
	int b;
	 Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	
	double area(){
		double areaofrectangle=this.l*this.b;
		return areaofrectangle;
	}
	


	public static void main(String [] args){
		Rectangle r= new Rectangle(4,5);
		Rectangle r1=new Rectangle(5,8);
		System.out.println("Area of rectangle1:"+r.area());
		System.out.println("Area of rectangle2:"+r1.area());
	}
}


