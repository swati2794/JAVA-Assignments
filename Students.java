class Students
{

	String name;
	int age;
	String adress;
	Students()
	{
	this.name="unknown";
	this.age=0;
	this.adress="not available";
	}
	void setInfo(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void setInfo(String name, int age,String adress)
	{
		this.name=name;
		this.age=age;
		this.adress=adress;
	}
	
	public static void main(String [] args)
	{
		Students s = new Students();
		s.setInfo("akash",1);
		Students s1= new Students();
		s1.setInfo("swati",25);
		
		Students [] sarr= new Students[2];
		sarr[0]=s;
		sarr[1]=s1;
		
		for (int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i].name+" "+sarr[i].age+" "+sarr[i].adress);
		}
	}
}