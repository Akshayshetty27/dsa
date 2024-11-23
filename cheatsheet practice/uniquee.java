import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
class uniquee
{
    public static void main(String args[])
    {
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();

        int arr[]={3,6,5,4,3,4,2,1,1};
        list.add(arr[0]);
        for( int i : arr)
        {
            for(int j : list)
            {
                if( i== j)
                {
                    continue;
                }
                else{
                    list.add(i);
                }
            }
        }

        for(int j : list)
        {
            System.out.println(" "+j);
        }
    }
}