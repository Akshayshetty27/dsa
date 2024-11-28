
class chatterBoard
{
    public static int  nextPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n % i == 0)
            {
                return nextPrime(n+1);
            }
        }
        return  n;

    }
    
    public static void main(String args[])
    {
        int num=5;
        int i=1;
        int n=2;
        int next=2;
        int j=0;
       while( j< (num*num))
       {
         if(j>0 && j% 5 ==0 )
         System.out.println("");
        if(j % 2 == 1)
         System.out.print("-");
        else
        {
            int r=nextPrime(n);
            System.out.print(""+r);
            n=r+1;
        }
       
      j++;
       }
    }
}