import java.util.HashMap;   
class Four{
    public static void main(String[] args) {
     
     String str ="listen";
        String str2 ="silent";
    HashMap<Character , Integer > charCount1 = new HashMap<>();
    HashMap<Character , Integer > charCount2 = new HashMap<>();

    if( str.length() != str2.length())
    {
        System.out.println(" Not Anagram");
        return;
    }else
    {
    for( int i=0 ; i< str.length(); i++)
    {
        char ch1 = str.charAt(i);
        char ch2 = str2.charAt(i);
        charCount1.put(ch1, charCount1.getOrDefault(ch1 , 0) + 1);
        charCount2.put(ch2, charCount2.getOrDefault(ch2 , 0) + 1);

    }}

    if( charCount1.equals(charCount2))
    {
        System.out.println(str2+" and "+str+" are Anagram");

    }
    }
}