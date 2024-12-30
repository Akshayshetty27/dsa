import java.util.*;
class vector
{
    enum week
    {
        Monday, tuesday , wednesday , thursday , friday , saturday , sunday ;
    }
    public static void main(String args[])
    {
        List< Integer> list_v = new Vector<>();
        list_v.add(4);
        list_v.add(6);
        list_v.add(7);
        list_v.add(3);
        System.out.println(list_v);


        // Enumeration in java 
        //  enum is a class in which contains  constant 
        // by default they are  public static  and final 
        // cannot create child enums 
        // type is (class name )  in java 
        
        week weak;
        weak=week.Monday;
        for( week day : week.values())
        {
            System.out.println(day);
        }


         System.out.println(" first day " +weak);
    }
}