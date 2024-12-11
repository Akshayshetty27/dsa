import java.util.Scanner;
class Cylinder
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter the number of cylinder");
         int s=sc.nextInt();
        System.out.print(" enter the number of drieres");
       
        int b=sc.nextInt();
        int cylinder[]= new int[s];
        for(int i=0; i< s; i++)
          cylinder[i]=sc.nextInt();

        for(int i : cylinder) 
         System.out.print(" "+i);
        
        

        

        

    }
}