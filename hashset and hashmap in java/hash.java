// hashset doesnt allow duplicte item
//  insertion time-complexity  O(1), search O(1) ,delete O(1)
import java.util.HashSet;
import  java.util.Iterator;
public class hash
{
    public static void main(String args[])
    {
        // creating hashset of integer type 
     HashSet<Integer> set = new HashSet<>();
   
     // Insert a element to a hashset  - add(element)
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(1);

     // Searching in hashset - contains(element)
     if(set.contains(1))
     {
        System.out.println("set contains 1");
     }
     if(set.contains(6))
     {
        System.out.println("set contains 6");
     }

// size of hashset  . size()
System.out.println(" size of set  "+set.size());
     //deleting elemnt in hashset  .remove
     set.remove(1);
     System.out.println(" "+set);

     if(!set.contains(1))
     {
        System.out.println(" set does not contains 1");
     }

// Iterating in hashset 
  Iterator it=set.iterator();
//   it.next() to iterate from current to next  example  0 to 1( 0 ->1)
//  it.hasNext() to check  whether next element is  there or not 
while (it.hasNext())
{
   System.out.print(" "+ it.next());
}
    }
}