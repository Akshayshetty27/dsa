import java.util.HashMap;
class Three{
    public static void main(String args[])
    {
        String str ="AAABBCCC";

        HashMap<Character , Integer > charCount = new HashMap<>();
        for( int i=0 ; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch , 0) + 1);
        }

        for( char ch :  charCount.keySet())
        {
            System.out.println(ch +" : "+ charCount.get(ch));
        }


System.out.println(" Without HashMap");

int k=0; 
while( k < str.length())
{
    int count =1;
    char ch = str.charAt(k);
     while( k < str.length()-1 && ch == str.charAt(k+1))
     {
        count++;
        k++;
     }
        System.out.println(ch +" : "+ count);
        k++;
}

    }
}