class oddoreven
{
    public static void main(String args[])
    {
        int number=1117;
           checker(number);
       
        
    }

    public static void checker(int num)
    {
        int temp=num;
        int r= num /2 ;
        if( r * 2 == temp)
        {
            System.out.println(num+" is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}