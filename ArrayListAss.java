import java.util.*;
class ArrayListAss
{	public static void main(String [] args){
	ArrayList <String> list=new ArrayList<>();
	{
		
		list.add("abc");
		list.add(1,"abcd");
		System.out.println(list);
		System.out.println(list.get(1));
		String s=list.set(1,"pqr");
		System.out.println(s); // update and return object that was update
		System.out.println(list.get(1));
		System.out.println(list);
		list.add("mno");
		list.add("lmn");
		System.out.println(list);
		System.out.println(list.remove(2)); // return that you remove
		System.out.println(list.contains("abc"));
		Collections.sort(list);
		System.out.println(list);			// ascending order
		Collections.sort(list,Collections.reverseOrder());   // descending order
		System.out.println(list);
		list.clear();
		System.out.println(list);      // empty array list

		
		}
	}
	
}