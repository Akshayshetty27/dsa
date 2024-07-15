import java.util.Scanner;
public class switchop{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int input;
        while(true)
        {
            
            input=sc.nextInt();
            switch(input){
                case 1: System.out.println("helllo");
                break;
                case 2: System.out.println("namasthe");
                break;
                case 3: System.out.println(" bonjour");
                break;
                default: System.out.println("invalid input"); 
            }
        }
    }
}