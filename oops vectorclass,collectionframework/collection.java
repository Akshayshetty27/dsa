import java.util.*;
class collection
{
    public static void main ( String args[])
    {
// makes use of already defined  collection such as arrayList, HashMap , Hashset  ,LinkedList ,stack , Queue   etc
// List : 
//  i) ArrayList :  add( ), clearAll(), 
//  ii) Linkedlist 
//  iii) stack 
//  iv) Queue 


List<Integer> list = new ArrayList<>();
list.add(4);
list.add(6);

for ( int  i : list)
 System.out.print(i+" ");

//  list.clear();


for ( int  i : list)
 System.out.print(i+" ");
    }
}