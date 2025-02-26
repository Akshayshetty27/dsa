import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Kfreq
{
    public static void main(String args[])
    {
        int arr[]={3,3,4,2,2,1};
        int k=2;
HashSet<Integer> set = new HashSet<>();
HashMap<Integer,Integer> map = new HashMap<>();

for( int i : arr)
 set.add(i);

for(int i : set)
{
    int count =0;
    for( int  j = 0 ; j< arr.length ;j++)
    {
        if( i == arr[j])
        count++;

    }
    map.put(i , count);
}

List ar = new ArrayList<>();
for(Map.Entry<Integer,Integer> e : map.entrySet() )
{
if(e.getValue()  >= k )
{
   ar.add(new int [] {e.getKey()});

}
}

for( int i : ar)
 System.out.println(" "+i);

    }
}