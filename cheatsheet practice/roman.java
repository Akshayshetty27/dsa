import java.util.HashMap;
import java.util.Map;
class roman 
{
     public static void main(String args[])
     
     {
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('i',1);
        map.put('v',5);
        map.put('x',10);
        map.put('l',50);
          map.put('c',100);  
          map.put('d',500);
            map.put('m',1000);
        String str="cmvl";

        int num=0;
        for(int i=0;i<str.length() -1 ;i++)
        {
         if( map.get(str.charAt(i))  < map.get(str.charAt(i+1)))
         {
            num -= map.get(str.charAt(i))  ;
         }
         else
            num+= map.get(str.charAt(i))  ;
        }
        num+= map.get(str.charAt(str.length()-1));

System.out.println("the conversion of roman number  "+str+" :"+num);
// for( Map.Entry<Character ,Integer> e : map.entrySet())
// {
//    System.out.println(" "+ e.getKey()+" "+e.getValue());
// }



     }
}