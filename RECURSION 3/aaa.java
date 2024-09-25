import java.util.Scanner;
class aaa{
    static int  xpower(int n,int x)
    {
      if(x==1)
      {
     return n;
        
      }
   
      return n*(xpower(n,x-1));


    }
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number ");
        int n=sc.nextInt();
        int x;
         System.out.println(" enter the power ");
        x=sc.nextInt();
        System.out.println(" "+n+" power "+x+" is : "+xpower(n,x));

}

}