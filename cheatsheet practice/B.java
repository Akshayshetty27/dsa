import java.util.ArrayList;
import java.util.HashSet;
class B
{
    public static void main(String args[])
    {
        int arr[]={4,6,5};
        int  b[]={ 7,4,3,6,7};
        int c[]={4,6,5,7,4,3,6,7,};
        ArrayList<Integer> interseclist= new ArrayList<>();
        System.out.println(" the intersection of the two array are ");
        for(int i : arr)
        {
         for( int j : b)
         {
              if(i== j)
               interseclist.add(i);
         }
        }

        System.out.println(interseclist);
       
       HashSet<Integer> set= new HashSet<>();
       int size= arr.length + b.length ;
       
       for( int i : c)
        set.add(i);

System.out.println(set);
            }
}