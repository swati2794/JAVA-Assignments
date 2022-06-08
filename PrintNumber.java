class PrintNumber{
	void printn(short s)
	{
		System.out.println("short"+s);
	}
	void printn(int i)
	{
		System.out.println("int"+i);
	}
	void printn(float f)
	{
		System.out.println("float"+f);
	}
	void printn(double d)
	{
		System.out.println("double"+d);
	}
	void printn(long l)
	{
		System.out.println("long"+l);
	}
	void printn(int i, char c)
	{
		System.out.println("int: "+i +"char: "+ c);
	}
	
	void printn( char c, int i)
	{
		System.out.println("char"+c +"and int:"+i);
	}
	
	
	public static void main(String [] args){
		PrintNumber p= new PrintNumber();
		p.printn(10);
		p.printn(10.2);
		p.printn(10.2f);
		p.printn(15203);
		p.printn(10,'A');
		p.printn('B',15);
	
	}
	
}

