// printing the element that appeared majority (i.e if( frequency of number  > array.length / 3 ))


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
class questions
{
public static void findmajority(int arr[]){
    HashSet<Integer> set =new HashSet<>();
    HashMap<Integer, Integer>  freqmap= new HashMap<>();

   for(int i : arr){
    set.add(i);
   }
   
   for(int num : set)
   {
    int freq=0;
    for(int i : arr)
    {
        if( num == i)
         freq++;
    }
    freqmap.put(num ,freq);

   }
    for(Map.Entry<Integer ,Integer> e : freqmap.entrySet())
    {
        // System.out.print(" "+e.getKey());
        // System.out.println(" "+e.getValue());
        if( e.getValue() > (arr.length / 3))
        {
            System.out.println(" "+ e.getKey());
        }
    
   }



   // another approach 
System.out.println("Method 2");
   HashMap<Integer,Integer> mapp= new HashMap<>();
            for ( int i : arr)
            {
                // for(Map.Entry<Integer,Integer> e2 : mapp.entrySet())
                // {
                     if(mapp.containsKey(i))
                     {
                        mapp.put(i, mapp.get(i) + 1);
                    }else{
                        mapp.put(i, 1);
                    }             
                     }

                     for(Map.Entry<Integer,Integer> e2 : mapp.entrySet())
                {
                    if(e2.getValue() > (arr.length /3))
                    {
                        System.out.println(" "+e2.getKey());
                    }
                }
                }

      
           public static void main(String args[])
    {
int arr[]={1,3,2,5,1,3,1,5,5,5,1,};
findmajority(arr);


    }
}