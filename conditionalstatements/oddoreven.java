import java.util.Scanner;
public class oddoreven{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num;
         System.out.println("enter  a number \n");
        num=sc.nextInt();
        if (num%2==0)
        {
            System.out.println(" it is even");

        }
        else{
          System.out.println(" it is odd");   
        }
    }

}