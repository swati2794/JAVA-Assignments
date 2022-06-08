import java.util.*;
class LinkedListclass{
public static void main(String [] args)
{

	LinkedList <String> list= new LinkedList<> ();
	list.add("aman");
	list.add("chaman");
	list.add("saman");
	list.add("baban");
	//System.out.println(list);
	// iterating list
	for (int i=0; i<= list.size();i++)
	{
		//System.out.println(list);
	}
	
	// for each loop for iterating
	for(String val:list)
	{
		//System.out.println(list);
	}
	
	// iterate list reverse order
	for (int i=list.size(); i>=0;i--)
	{
		System.out.println(list);
	}
	list.add(1,"asha");
	System.out.println(list);
	list.set(2,"sana");
	System.out.println(list);
	System.out.println(list.indexOf("asha"));
	System.out.println(list.get(1));
	System.out.println(list.peek());			// defalut peek first inserted value
	System.out.println(list.poll());    // defalut remove first inserted value
	System.out.println(list.peekFirst());
	System.out.println(list.peekLast());
	
	
	System.out.println(list);
	System.out.println(list.remove(1));   // remove name at index one
	System.out.println(list);
	list.push("swati");				// adding element at first index
	list.add("akash");				// adding element at alast
	System.out.println(list);
	list.offer("kk");
	System.out.println(list);			// add last
	list.addLast("YY");
	System.out.println(list);
	list.offerFirst("YY");				// add from start
	System.out.println(list);
	
	list.offerLast("mm");
	System.out.println(list);
	
	list.pollFirst();				// remove first and last elemnet 
	System.out.println(list);
	list.pollLast();
	System.out.println(list);
	list.pop();
	System.out.println(list);  // remove first element
	//list.set("mm","asha");
	list.contains("asha");
	System.out.println(list.contains("asha"));
	
	
	
	
}



}