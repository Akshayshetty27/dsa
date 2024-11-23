class PrimeSum
{
    public boolean isPrime(int n)
    {
        for(int i=2; i<n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        PrimeSum s=new PrimeSum();
        int bill=4579;
        int n=0;
        int sum=0;
        while(bill> 0)
        {
            n=bill%10;
            if(s.isPrime(n))
            {
                sum += n;
            }
            bill=bill/10;
        }
System.out.println(" the prime sum "+sum);
    }
}