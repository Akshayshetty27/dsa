import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        //  1. for loop 
        //  syntax :   for(initialization : condition; increement or decreement)
        Scanner sc= new Scanner(System.in);
        int i;
        //  to print 0 to 10 numbers
        for(i=0;i<11;i++)// (i++ => i=i+1)
        {
            System.out.println(" hello world "+ (i));
        }
    //     printing the even numbers
    System.out.println(" printing even numbers ");
    for(i=1;i<11;i++)// (i++ => i=i+1)
        {
            if(i%2 ==0)
             System.out.print(" "+ (i));
            else{
                continue;
            }
        }
        
    
     System.out.println(" \nprinting odd numbers ");
    for(i=1;i<11;i++)// (i++ => i=i+1)
        {
            if(i%2 !=0)
             System.out.print(" "+ (i));
            else{
                continue;
            }
        }


        //  while loop 
        //  syntax   while( condition){ increement or decreement}
        System.out.println(" \nwhile loop ");
        i=0;
        while(i<11)
        {
            System.out.print(" "+i);
            i=i+1;
        }


System.out.println("\n printing odd numbers");
         i=0;
        while(i<11)
        {
            if(i%2 !=0)
             {System.out.print(" "+ (i));
             i=i+1;
             }
            else{
                i=i+1;
                continue;
            }
        }


System.out.println(" \ndo while loping ");
        //  do while 
        //  syntax   :    do { statements  and increment or decreement }while(condition);
        //  it will execute atleast one time 
i=0;
        do{
            System.out.print(" "+(i+1));
            i=i+1;     
            }while(i<10);
    }
}