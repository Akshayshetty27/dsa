
import java.util.Map;
import java.util.HashMap;
public class Third
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Map<Character , Integer >  map = new HashMap<>();
		map.put('x',10);
		map.put('v',5);
		map.put('i',1);
		
		String s = "xx";
		
		int i= 0; 
		int n=0;
		
		while ( i < s.length() )
		{
		    int c = map.get(s.charAt(i));
            int next =0; 
            if(i + 1 < s.length() )
                next = map.get(s.charAt(i + 1));

            if( c < next)
            {
                n += next -c;
                i += 2  ;
            }else{
                n += c;
                i++;
            } 
		}
		    
		System.out.println(" number "+n);
	}
}