class number
{
    static public int decimaltooctal(int dec)
    {
       int oct=0;
       int count=1;
       while(dec>0)
       {
            int rem= dec%8;
            dec=dec/8;
            oct+= rem*count;
            count=count*10;


            
       }
       return oct;
    }
    public static void main(String args[])
    {
int number=634;
System.out.print(" "+decimaltooctal(number));

    }
}