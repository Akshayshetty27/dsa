import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

class frequency{
public static void main(String args[])
{
    int arr[]={ 3,2,1,5,6,1,2,6};
    HashMap<Integer, Integer> map= new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    for( int i : arr){
        set.add(i);
    }

for( int i : set){
System.out.println(" "+i);
}

for( int i : set){
    int count=0;
    for(int j : arr)
    {
        if(i == j)
        {
            count++;
            map.put(i , count);
        }
    }
}

for( Map.Entry<Integer, Integer>  e : map.entrySet())
{
    System.out.println(" "+e.getKey()+ " "+ e.getValue());
}
}

// for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
//         }
}