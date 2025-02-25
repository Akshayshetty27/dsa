class Sum_of_Digits_Until_a_Single_Digit
{
    public static int findsum(int num)
    {

         num = reveresednum(num);
         System.out.println(" "+num);

        int r=0;
        int s=0;

        while( num > 0)
        {
            r= num%10;
            s+= r;
            if( s >=10 )
            {
                System.out.println(" "+s+ " "+r);
                return s - r;
            }
            num=num / 10 ;
       }
       return s;
    }

    public static int reveresednum(int num)
    {
        int r=0;
        int rev=0;
        while( num > 0)
        {
            r= num%10;
            rev= rev * 10 + r;

            num=num/10;
        }

        return rev;
    }
    public static void main(String args[])
    {
        int number=12345;
        System.out.println(findsum(number));

    }
}