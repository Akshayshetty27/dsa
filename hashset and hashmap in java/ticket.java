
import java.util.HashMap;
import java.util.Map;

class ticket 
{
    
 public static String getstart( HashMap<String ,String>  map)
    {

        HashMap<String ,String>  revmap = new HashMap<>();
        for(Map.Entry<String,String> e : map.entrySet())
        {
           revmap.put(e.getValue(),e.getKey());
        }

          for(String city : map.keySet())
        {
            if(revmap.containsKey(city) == false)
             { 
               return city; 
             }
        }

        return  null;
    }
    public static void main(String args[])
    {
        HashMap<String ,String>  map = new HashMap<>();

        map.put("chennai", "Bengaluru");
        map.put("goa","chennai");
        map.put("mumbai","delhi");
        map.put("delhi","goa");

      
      String start=getstart(map);
      System.out.print(""+start);
    //   printingpath(start, map);
    while( map.containsKey(start))
      {
     System.out.print("->"+map.get(start)); 
     start=map.get(start);
      }
        
    }
}