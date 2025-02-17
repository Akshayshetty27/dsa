
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Comparator;



class Demo
{
    public static void main(String args[])
    {
    List <Students> list= new ArrayList<>();
    list.add(new Students( 21 , "Akshay "));
    list.add(new Students( 25 , "ABhilash "));
    list.add(new Students( 23 , "shetty"));
    list.add(new Students( 29 , "Manhora aaa"));

    Comparator<Students> com = new Comparator<>(){
        public int compare( Students i , Students j)
        {
            if( i.name.length() > j.name.length()) 
             return 1;
            else
             return -1;
        }
    };
    
Collections.sort(list,com);


    System.out.println(" "+list);
    for( Students s : list)
    {
        System.out.println( s.age  +" "+ s.name);
    }

System.out.println(" Set ");

    HashSet <Integer> set = new HashSet<>();
    set.add(14);
    set.add(2);
     set.add(7);
    set.add(15);
     set.add(22);
    set.add(11);


    for( int i : set)
     System.out.println(i);





    Map <Character, Integer>  map = new HashMap<>();
    HashSet<Character> s= new HashSet<>();
    String str= "akshay";
    for( int i=0 ; i< str.length(); i++)
    {
            s.add(str.charAt(i));
    }

    for( char ch : s)
    {
        int count =0;
        for( int i=0; i< str.length() ; i++)
        {
            if( ch == str.charAt(i) )
            {
                count++;
            }
        }
        map.put( ch , count);
    }
   
  for(  char ch : map.keySet())
   System.out.println(" "+ch + "  "+ map.get(ch));


   for( Map.Entry<Character , Integer >  e  :  map.entrySet())
   {
    System.out.println(" "+e.getKey()+ " "+ e.getValue());
   }
    } 
}


class Students{
    int age;
    String name ;
    Students(int age , String name)
    {
        this.age = age ;
        this.name= name;

    }


}