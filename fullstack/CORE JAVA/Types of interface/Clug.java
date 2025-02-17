class Clug
{
    public static void main(String args[])
    {

    A obj = (i ,j)->
    {
        System.out.println(" "+i+ " + "+ j+ " = "+(i + j));
    };

      obj.add(4,5);
    }

  
}
@FunctionalInterface
interface A
{
    public void add(int a ,int b);
}

class B implements A{
   public void add(int i , int j)
    {
System.out.println(" "+(i + j));
    }
}