// Decode String like "3[a2[c]]" to "accaccacc" using a stack.
import java.util.Stack;
class Third {
    public static void main(String args[])
    {
        String str ="3[a2[c]]";
        Stack<Character> stack = new Stack<>();
        int j=0; 
        while(str.charAt(j) != ']')
        {
            if(str.charAt(j) == '[')
            {   
                j++;
                continue;
            }else
            {
            stack.push(str.charAt(j));
            j++;
             }
        }

        

         if(stack.isEmpty())
         {
            System.out.println(" the stack is empty ");
            return;
         }
        String st="";
        String p="";
        for( int i = stack.size()-1 ; i > 0 ; i= i - 2)
        {
            StringBuilder local = new StringBuilder();
            char ch = stack.get(i);
            String s= stack.get(i - 1).toString();
            int n = Integer.parseInt(s);
            for( int k=0; k< n ; k++)
            {
             local.append( ch + p ) ;   
            }
            p = p + local.toString();
            st = local.toString();

        }
        
System.out.println("string : "+str+" Decoded String: " + st);
    }
}