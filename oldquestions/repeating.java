import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
class repeating
{
    public static void main(String args[])
    {
        int arr[]={ 2,3,4,5,3,4,};
        HashSet<Integer> set= new HashSet<>();
        for( int i : arr)
         set.add(i);

        HashMap<Integer, Integer> map= new HashMap<>();

        for( int i : set)
        {
            int freq=0;
            for( int j : arr)
            {
                 if( i == j)
                 {
                   freq++;
                 }
            }
            map.put( i , freq);
        }

        for( Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() > 1)
            {
System.out.println(" "+e.getKey()+" "+ e.getValue());
            }
            
        }
    }
}