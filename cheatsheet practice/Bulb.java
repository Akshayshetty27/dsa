class Bulb
{
    public static void main(String args[])
    {
        int arr[]= new int[100];
        for(int i=1; i*i <=100 ;i++)
        {
            System.out.println(i*i);
        }
        

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if((i+j)== 4 || (i-j) == 0 )
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }
             System.out.println(" ");
        }
int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)== (n/2) || (i-j) == (n/2) || (j-i)==(n/2) || ((i> (n/2) && i<(n-1))&& (i==j)) )
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }
             System.out.println(" ");
        }

    }
}