 import java.util.Scanner;
 public class varib{
    public static void main(String args[])
    {
          Scanner sc= new Scanner(System.in);
      System.out.println(" ente a ,b,c value");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int d=sc.nextInt();
   //  variables  types 
   // 1)primitive - 1. int   2. float 3.double 4) boolean 5)byte 6) short 7) long 8)char
   // 2) non primitive  1) string 2)arraay 3) class 4) object 5) interface

    int  area = (a*b);
    int diff=(a-b);
    int qu=area/diff;
     System.out.println(" "+((a*b)/(a-b)));
     System.out.println(" the quiz answer \n"+qu);
   System.out.println("enter the name ");
   String name=sc.nextLine();
   System.out.println(" "+area);
   System.out.println(" "+d);
   System.out.println(" "+name);
   // int  - sc.nextInt();
   // float- sc.nextfloat();
   // string- sc.nextline();
   //char - sc.nextChar();
                }
}