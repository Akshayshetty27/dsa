import java.util.Scanner;
import java.util.Random;

class ATM
{
            static int total_amount = 500;

    public static void main(String args[])
    {
        int choice;
        Scanner sc= new Scanner(System.in);
        boolean ch = true;

        while(ch)
        {
            System.out.println(" Enter your choice \n");
            choice= sc.nextInt();

            switch(choice)
            {
                case 1: 
                System.out.println(" enter the amount you want to withdraw  ");
                int withdraw_amount = sc.nextInt();
                if( withdraw_amount > total_amount )
                {
                    System.out.println(" Requested amount is higher than available amount \n you are short of :"+(withdraw_amount - total_amount )+" Rs");
                }else
                {
                    total_amount  -= withdraw_amount ;
                    System.out.println(" take out your "+withdraw_amount+ " rs \n available amount is : "+total_amount);
                }
                 break;

                 case 2:
                    System.out.println(" enter the amount you want to add ");
                    int add_amount = sc.nextInt();

                    total_amount += add_amount;
                    System.out.println(" "+add_amount+" has been added to your account "+ " total amount available = "+ total_amount);

                    break;

                case 3: 
                System.out.println(" available balance : "+total_amount);
                break;

                case 4: 
                System.out.println(" enter the code you seeing in the terminal \n");
                Random random = new Random();
                int rand = random.nextInt(9000)+ 1000;

                System.out.println(" "+rand);

                int userinput= sc.nextInt();
                if( userinput == rand)
                {
                    System.out.println(" your ATM has been blocked ");
                    System.exit(0);

                }
                break;

                default :
                System.out.println(" enter valid choice ");
                break;
            }

            System.out.println(" you want to continue ");
            ch= sc.nextBoolean();

        }



    }
}


// want to add  1. withdraw  2. add cash  3. check amount  4. Block  