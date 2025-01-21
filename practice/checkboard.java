import java.util.Scanner;
class checkboard
{
    public static int  nextprime(int count)
        {
                    for(int i=2; i<count ;i++)
                    {
                        if(count% i == 0 )
                        {
                            return nextprime( count +1);
                        }
                    }
                    return count;
        }
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        int count=1;
        int next=0;
        System.out.println(" enter the number ");
        n= sc.nextInt();
        for( int i=0; i< n ;i++)
        {
            for(int j=0; j< n;j++)
            {
                if( (i+j)% 2 == 1)
                {
                    System.out.print(" ->");
                }
                else
                {
                    System.out.print(" "+count);
                    next= nextprime(count + 1);
                    count= next;
                }
            }System.out.println("");
            
        }
    }
}