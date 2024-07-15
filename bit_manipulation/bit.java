import java.util.Scanner;
class bit
{
    public static void main (String  args[])
    { 
        Scanner sc= new Scanner(System.in);
        //  bit operation
        // 1. get bit 
        // 2.set bit
        // 3.clear bit 
        // 4.update bit


    int n=5;
    int  l=n<<2;
    int result= l & n;
    if(result == 0)
    {
    System.out.println(" the bit was zero "+result);
    }
    else{
       System.out.println(" the bit was not  zero  that is "+result); 
    }
    int result2= l | n;
    if(result2 !=0 )
    {
        System.out.println(" the bit is "+result2);
    }   
        System.out.println(" CLear bit ");
       int oper=sc.nextInt();

    int num=5;
    int pos=1;

    //  set operator
       int bitmask= 1<< pos;
       int nrewNum= bitmask | n;
            System.out.println(" the bit is "+result2);

    //  clear bit 
    int clearnit=l<<1;
if(oper==1){
    int newNum=bitmask|n;
    System.out.println(" "+nrewNum);
}
else{
    int newbitMask=~(bitmask);
    int newdd=newbitMask &n;
    System.out.println(" "+newdd);}
     }
}