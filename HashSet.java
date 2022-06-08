
import java.util.HashSet;
class HashSetclass
{
	
	public static void main(String [] args)
	{
		HashSet <String> list= new HashSet<>();
		list.add("abc");
		list.add("pqr");
		System.out.println(list);
		
		list.remove("abc");
		System.out.println(list);
		System.out.println(list.contains("pqr"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
	}
}
