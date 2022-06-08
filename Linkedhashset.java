import java.util.LinkedHashSet;
import java.util.Iterator;
class Linkedhashset
{
	public static void main(String [] args)
	{
		LinkedHashSet<Integer> set= new LinkedHashSet();
		set.add(12);
		set.add(13);
		System.out.println(set);
		set.remove(13);
		set.hashCode();
		//System.out.println(set);
		//System.out.println(set.hashCode());
		
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}