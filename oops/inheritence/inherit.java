class Shape{
    public void area()
    {
        System.out.println(" displays  area ");
    }
}
class Triangle extends Shape
{
     public void area(int b,int h)
    {
        System.out.println((b*h)/2);

    }

}

class Circle extends Shape
{
   public  void area(int r)
    {
        System.out.println(" "+(3.14)*r*r);
    }
}
    class equi extends Triangle{
      public void area(int b,int h)
    {
       System.out.println(1/2*b*h); 
    }
}
public class inherit
{
    public static void main(String args[])
    {
        Triangle t1= new Triangle();
        // t1.color="red";
        // System.out.println(" color : "+t1.color);
        t1.area();
        t1.area(5,6);
        Circle c1=new Circle();
        c1.area();
        c1.area(4);
    }
}