import java.util.HashMap;
import java.util.Map;
// hashmap stores the information  key ->value  like structure 
// key remains unique and  value may be same 
class mapping
{
    public static void main(String[] args) {
        HashMap< String ,Integer > map= new HashMap<>();
    // operations 
 // Insert 
  map.put("India", 155);
  map.put("China",140);
  map.put("USA", 30);
  System.out.println(""+map);

  // searching in hashmap
  if(map.containsKey("China"))
    System.out.println("present in the map "+map.get("China"));
  else
   System.out.println(" not present in the map "+map.get("China"));

// get function  to get the value of currsponding key 
System.out.println("China "+" "+map.get("China"));


// Iteration in hashmap
// collection 
 

 for(Map.Entry<String,Integer> e : map.entrySet())
      {
        System.out.print(" "+e.getKey());
        System.out.print(" "+e.getValue()+"\n");
      }
    }
}
// functions
// 1.put()
// 2.get()
// 3.containsKey()
// 4.remove()
// 5.size()
// 6.keyset()
