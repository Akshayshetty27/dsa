class level1
{
    public  static void  nto1(int n)
    {
        if( n==1)
        {
         System.out.print(" "+ n);
         return;
        }
        
        System.out.print(" "+n);
        nto1(n-1);
    }
     public  static void  oneton(int n)
    {
        if( n==1)
        {
         System.out.print(" "+ n);
         return;
        }
        nto1(n-1);
        System.out.print(" "+n);
        
    }

    public static int  product( int n)
    {
        if( n== 1)
        {
           return 1;
        }
        return n*product(n-1);
    }
    public static int  sum( int n)
    {
        if( n== 1)
        {
           return 1;
        }
        return n + sum(n-1);
    }
static int s=0;
public static int sumofdigit(int num)
{
    if(num ==0)
    {
        return 0;
    }
    s=num % 10 ;
    num=num/10 ;
    // System.out.println(s);
    return s+sumofdigit(num);
}

static int p=0;
public static int productofdigit(int num)
{
    if(num == 0)
    {
        return 1;
    }
    p=num % 10 ;
    num=num/10 ;
    // System.out.println(p);
    return p*productofdigit(num);
}


static int count=0;
public static int countzero(int num)
{
    if( num==0 )
     return count;
   int  rem=num % 10 ;
    if( rem == 0)
     count=count+1;
    num=num/10 ;
    // System.out.println(" \n"+count);
    return  countzero(num);
}
    public static void main(String aargs[])
    {

System.out.println(" n  to 1");

nto1(5);
System.out.println(" \n1 to n ");
oneton(5);
System.out.println("\n  product using recursion "+product(5));
System.out.println(" \n sum of n number "+sum(5));
System.out.println(" sum of digit "+sumofdigit(345));
System.out.println("product using "+productofdigit(532));  
System.out.println("rev a number  ");  
int rev=0,rem=0;
int num=453;
 
    while (num > 0)
    {
        rem=num%10;
        rev= rev*10 +rem;
        num=num/10;
        // System.out.println(rem);
      }
      System.out.print(" "+rev);
  
System.out.println(" \n count zero "+countzero(5032));  
}



}
