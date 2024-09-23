
import java.util.*;

class bankaccount{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int select;
        int amt,deposit=0;
        boolean ch=true;
     while(ch)
     {
     System.out.println("select the option you  want perform \n 1.credit \n 2.deposit \n 3. to exit 0");
     select=sc.nextInt();
     switch(select) {
         case 1: 
         System.out.println("you have selected to credit \n enter the amount ");
         amt=sc.nextInt(); 
         deposit+= amt;
         System.out.println(" your have credited "+amt+"total  available amount "+deposit);
         System.out.println("enter true to to perform operation and false to exit");
         ch=sc.nextBoolean();
             break;
         case 2:
System.out.println("you have selected to deposit \n enter the amount ");
         amt=sc.nextInt(); 
         if(amt > deposit)
         {
            System.out.println(" cannot take that amount, your available balance is:"+deposit);
         
         }
         else{
            deposit-=amt;
            System.out.println("you have taken "+amt+" your remaining balance is"+deposit);
         
         }
          System.out.println("enter true to to perform operation and false to exit");
            ch=sc.nextBoolean();
            break;
         default:
             throw new AssertionError();

    
     }
    }
    
    }
}