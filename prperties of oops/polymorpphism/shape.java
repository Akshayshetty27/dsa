class shape
{
    void area()
{
    System.out.println(" i am in shapes ");
}  
  public static class Circle extends shape
    {
    void area()
    {
        System.out.println(" area pie * r *r ");
    }}
    public static class Triangle extends shape{
void area()
{
        System.out.println(" area .5 *height * breadth ");

}
    }

    public static class Square extends shape{
void area()
{
        System.out.println(" area is square of sides( side * side )");

}
    }
    public static  void main(String args [])

{
    // polymorphism  
     // --> poly - many  morphism - ways to represent  ( thus it a many ways to represent a class)
   shape shpe= new shape();
   Circle cir= new Circle();
   Square sq = new Square();
   Triangle tri = new Triangle();
      
shpe.area();
cir.area();
sq.area();
tri.area();


// types of polymorphism
//  1.  compile -time polymorphism 
}
}