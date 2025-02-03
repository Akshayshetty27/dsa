class OopInheritence
{
    public static void main(String args[])
    {
        Advanced c1= new Advanced();
        System.out.println(c1.add(4,3));
        System.out.println(c1.subtract(4,2));
        System.out.println(c1.mult(3,4));
        System.out.println(c1.modulus(3,4));
        System.out.println(" power : "+c1.pow(3,3));
    }
}
class Calc{
public int add(int a , int b)
    {
        return a+b;
    }
    public int subtract( int a , int b)
    {
        return a-b;
    }
    public int mult( int a , int b)
    {
        return a*b;
    }
    public int div( int a , int b )
    {
        return a/b;
    }
}

//  A  Advanced   class is extension of the   Calc class which  adds two more method  to the calculator  function 

class Advanced extends Calc
{
public int modulus(int a , int b)
{
    return a % b;

}

public int pow(int a , int b)
{
    int sum=a;
    for(int i=1 ; i < b ; i++)
    {
        sum *= a;
    }
    return sum;
    // return (int) Math.pow(a,b); 
}
}