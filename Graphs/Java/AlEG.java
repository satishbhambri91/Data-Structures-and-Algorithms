import java.util.*;
public class AlEG{
	public static void main(String[] args){

		ArrayList<String> aList = new ArrayList<String>(){
			{
				add("Satish");
				add("Kashish");
			}
		};

		LinkedList<String> linkedlist = new LinkedList<String>();

		linkedlist.add("Arjun");
		linkedlist.add("Himanshu");
		linkedlist.add("Anshul");
		linkedlist.addFirst("Satish");
		linkedlist.addLast("Kashish");

		//linkedlist.removeFirst();
		//linkedlist.removeLast();

		
		//while(enl.hasMoreElements()){
			//System.out.println(enl.nextElement());
		//}

		
		linkedlist.set(1, "Priyanka");

		System.out.println("Look here");
		System.out.println(linkedlist.get(0) + linkedlist.get(1));

		//aList.add("Satish");
		//aList.add("Kashish");
		//aList.add("Himanshu");

		Collections.sort(aList);
		//Enumeration<String> en = Collections.enumeration(aList);
		//while(en.hasMoreElements()){
		//	System.out.println(en.nextElement());
		//}

		linkedlist.addAll(aList);



		Enumeration<String> enl = Collections.enumeration(linkedlist);
		while(enl.hasMoreElements()){
			System.out.println(enl.nextElement());
		}
		System.out.println("The iterator can be used to parse through the list");
		Iterator it = linkedlist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}



	}
}