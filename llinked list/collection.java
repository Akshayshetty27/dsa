// import jav.util.LinkedList;
import java.util.*;
class collection{
    public static void main(String args[])
    {


LinkedList<String> list =new LinkedList<String>();
list.addFirst("C");
list.addFirst("B");
list.addFirst("A");
System.out.println(list);
list.addLast("D");
System.out.println(list);
System.out.println(list.size());
for(int i=0; i<list.size();i++)
{
    System.out.print("--> "+list.get(i));
}
System.out.println();
list.removeFirst();
System.out.println(list);
list.removeLast();
System.out.println(list);
list.remove(1);
System.out.print(list);
    }
}