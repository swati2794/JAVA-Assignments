

import java.util.TreeSet;
class TreeSetclass
{
	public static void main(String [] args)
	{
		TreeSet <String> set= new TreeSet <> ();
		set.add("banana");
		set.add("mango");
		set.add("orange");
		set.add("cherry");
		System.out.println(set);
		set.add("mango");
		System.out.println(set.size());
		System.out.println(set.isEmpty());
	}
}