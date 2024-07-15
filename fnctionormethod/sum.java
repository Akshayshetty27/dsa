import java.util.Scanner;
 public class sum{
    static void hello( String name ,String city)
    {
        System.out.println(" hello i am "+name+" i am from "+city);
    }
    static int sum(int num1 ,int num2)
    {
int sum=num1+num2;
return sum;
    }
     static int prdct(int num1 ,int num2)
    {
int product=num1*num2;
return product;
    }

    
    static int fact(int num1)
    {
        
        if(num1==1 || num1==0)
        {
            return 1;
        }
       int  fact =num1*fact(num1-1);
         
         return fact;
    }



    public static void main (String args[])
{
    Scanner sc = new Scanner (System.in);
    System.out.println(" enter the  two numbers");
    int num1,num2;
    num1= sc.nextInt();
    num2=sc.nextInt();
   int reslt= sum(num1,num2);
   int reslt2=prdct(num1,num2);
    System.out.println(" the result of sum :"+reslt+"\n and product :"+reslt2);
    System.out.println(fact(num1));
}
 }