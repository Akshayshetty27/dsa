import java.util.HashMap;
import java.util.Map;

class freq
{
    public static void main(String args[])
    {
        String str="Akshay";

        str=str.toLowerCase();
        char characters[]= new char[str.length()];
        characters=str.toCharArray();

Map<Character,Integer> map= new HashMap<>();
for(char ch: characters)
{
    if( ch == ' ')
    {
        continue;
    }else
    {
        map.put(ch , map.getOrDefault(ch,0) + 1);
    }
}


for(Map.Entry<Character,Integer> e : map.entrySet())
{
    System.out.println(" "+e.getKey()+" "+e.getValue());
}


    }
}