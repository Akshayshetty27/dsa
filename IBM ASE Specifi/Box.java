import java.util.HashMap;
import java.util.Map;
class Box{
    
    public static void main(String args[])
    {
        int arr[] ={ 234,456,12,45,67,324};
        HashMap<Integer , Integer> map = new HashMap<>();
    
        for( int i=0 ; i< arr.length ; i++)
        {

            int num = arr[i];
            int sum =0;
            while (num > 0)
            {
                int r= num% 10;
                sum += r;
                num= num/10;  
            }
            map.put(arr[i], sum);
        }


        for( Map.Entry<Integer ,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey()+" belongs to "+ e.getValue()+ " box");
        }

    }
}