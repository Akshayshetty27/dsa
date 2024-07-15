import java.util.Scanner;
class reverse{
    public static void reverse(String str,int index )
    {
    if(index==0)
    {
        System.out.print(""+str.charAt(index));
        return;
    }
    System.out.print(""+str.charAt(index));
    reverse(str,index-1);
    }

     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
String str;
System.out.println("enter a string ");
str=sc.nextLine();
reverse(str,str.length()-1);



}
}
