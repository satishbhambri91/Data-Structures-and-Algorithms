import java.util.*;

public class MapTest{
	public static void main(String[] args){
	
		//First datatype is of the keys and the second one is of Values

		HashMap<Integer,String> hmap = new HashMap<Integer,String>();

		hmap.put(1, "Satish");
		hmap.put(2,"Kashish");
		hmap.put(3, "Mehul");
		hmap.put(4,"Mehul");

		//Use keySet()instead of values() method
		Enumeration<String> en = Collections.enumeration(hmap.values());
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}



		System.out.println(hmap);

		Set set = hmap.entrySet();

		Iterator it = set.iterator();

		while(it.hasNext()){
			Map.Entry mentry = (Map.Entry)it.next();

			System.out.println("The key is :" + mentry.getKey() + " and the value is : " + mentry.getValue());
			
		}

		System.out.println("We can also iterate throught HashMap like this :");

		Iterator it2 = hmap.entrySet().iterator();

		while(it2.hasNext()){
			Map.Entry mentry2 = (Map.Entry)it2.next();

			System.out.println("The key is :" + mentry2.getKey() + " and the value is : " + mentry2.getValue());
			
		}

		 String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);

      /* Remove values based on key*/
      hmap.remove(3);
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
      }

	}
}