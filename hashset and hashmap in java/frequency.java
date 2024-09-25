
// import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class frequency {
    public  static  HashMap findfrequency(int arr[])
    {
       HashSet<Integer> set= new HashSet<>();
       HashMap<Integer ,Integer> frequencymap= new HashMap<>();
       for(int i : arr)
        set.add(i);
       
       for(int num : set)
       {
        int freq=0;
        for(int i : arr)
        {
            if( i == num)
            {
                freq++;
            }
            frequencymap.put(num,freq);
        }
       }

       for(Map.Entry<Integer,Integer> r : frequencymap.entrySet())
       {
          System.out.print(" "+r.getKey());
          System.out.println(" "+r.getValue());
       }
return frequencymap;

    }

    public static int firstduplicate(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            if(set.contains(i))
             return i;
            else
             set.add(i);
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[]={4,5,2,6,1,5,2,};
HashSet<Integer> set= new HashSet<>();
HashSet<Integer> set2= new HashSet<>();
set.add(2);
set.add(4);
set.add(5);
System.out.println(" "+set.contains(5));
System.out.println(""+set);
set2.add(1);
set2.add(2);
set2.add(3);
System.out.println("printing union of two set ");
for(int  num : set2)
{
    set.add(num);
}
System.out.println(" "+set);
System.out.println("printing intersection of two set ");
for (int i : set2)
{
  if(set.contains(i))
   System.out.print(" "+i);
}

System.out.println("");
// set.remove(4);
System.out.println(""+set);
      System.out.println(" printinting frequency of the array element"+findfrequency(arr));

System.out.println(" "+firstduplicate(arr));
    }
}