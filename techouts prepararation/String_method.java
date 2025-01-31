import java.util.Character;
class String_method {
public static void main(String args[])
{
    String str="Shetty akshay 333";

    char ch= str.charAt(4);
    System.out.println(" "+ch);
    String st[]= str.split(" ");
    for( String s : st)
    {
        System.out.println(" "+s);
    }

    boolean b= str.contains("a");
    System.out.println(" "+b);

    System.out.println(" "+str.indexOf("etty"));

    System.out.println(" "+str.startsWith("Shetty"));
        System.out.println(" "+str.endsWith("33"));

    
    
}    
}