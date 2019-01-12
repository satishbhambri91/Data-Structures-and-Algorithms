import java.util.*;
public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        
        PriorityQueue<String> queue = 
            new PriorityQueue<String>(15, new MyComparator());
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");

        PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(15, new MyComparator2());
        queue2.add(4);
        queue2.add(34);
        queue2.add(43);
        queue2.add(10);
      
        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());
        
        }
        while (queue2.size() != 0)
        {
            System.out.println(queue2.poll());
        
        }
    }
}
class MyComparator implements Comparator<String>
{
   @Override
   public int compare(String x, String y)
   {
      return x.length() - y.length();
   }
}

class MyComparator2 implements Comparator<Integer>
{
   @Override
   public int compare(Integer x, Integer y)
   {
      return x - y;
   }
}
