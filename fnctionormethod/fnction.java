import java.util.Scanner;
 public class fnction{
    static void hello( String name ,String city)
    {
        System.out.println(" hello i am "+name+" i am from "+city);
    }
    public static void main (String args[])
{
    Scanner sc = new Scanner (System.in);
    String name,city;
    System.out.println(" enter the name and city");
    name=sc.nextLine();
    city=sc.nextLine();
    hello(name,city);
}
}