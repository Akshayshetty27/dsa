class runtime
{
       public static  void area()
        {
            System.out.println(" calculate area of a shape ");
        }
       
  static  class circle extends runtime{
           public static   void area()
        {
            System.out.println(" calculate area of a circle  ");
        }
    }

    public static void main(String args[])
    {

// runtime  or dynamic polymorpphism
        // achieved by method overriding 
runtime r= new runtime();
r.area();
circle c= new circle();
c.area();

    }
}