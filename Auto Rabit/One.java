import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

class One {
    public static void main(String args[])
    {
        int arr[] = { 3,4,2,1,3,5,7};
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer , Integer > map = new HashMap<>();

        for( int i=0 ; i< arr.length ; i++)
        {
            set.add(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0 )+ 1);
        }
        for( int k : set)
        {
            System.out.print("  "+k);
        }
        System.out.println();
        for( Map.Entry<Integer, Integer > e : map.entrySet())
        {
            System.out.println(" key : "+e.getKey()+ " value : "+e.getValue());
        }

        }
}