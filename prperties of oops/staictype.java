class statictype
{
    public double sum(double a , int b )
    {
         return a + b;
    }
     public int sum(int a , int b ,int c)
    {
         return a+ b+c;
    }

    public static void main(String args[])
    {
statictype obj= new statictype();
System.out.println(" "+obj.sum(4,5));
System.out.println(" "+obj.sum(4,5,8));
    }
}