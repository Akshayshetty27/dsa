
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class repeating
{ public static void main(String[] args) {
    
    int arr[]= { 4,1,3,5,2,1,3};

    HashSet<Integer> set=new HashSet<>();
     for(int i : arr )
    {  System.out.print(" "+i);
      set.add(i);
    }
    HashMap<Integer,Integer> map= new HashMap<>();

    for(int num : set)
    {
        int freq=0;
        for( int i: arr)
        {
            if( num == i)
                freq++;

        }
        map.put(num, freq);
    } 

 System.out.println("\n repeating values  ");
    for(Map.Entry<Integer,Integer> e : map.entrySet())
    {
          if(e.getValue()> 1)
          {
            System.out.println(" "+e.getKey());
          }
    }
}}