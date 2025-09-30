// Create a Shape class with method area().

// Override in Circle, Rectangle, Triangle.

// Demonstrate method overriding (runtime polymorphism).

// Also create multiple area() methods with different parameters (method overloading).

class Ninth
{
    public static class Shape{
        int dimension;
        int breadth;
        int radius;

        public void area(){
            System.out.println(" Area of Shape");
        }
        public void setDimension(int a){
            System.out.println(" setting dimension of shape");
        }  


    }

    public static class Circle extends Shape{
        int radius;
        public void area(){
            System.out.println(" Area of Circle is : "+(3.14*radius*radius));
        }
        public void setRadius(int r){
            this.radius = r;
        }  
    }

    public static class Rectangle extends Shape{
        int dimension;
        int breadth;
        public void area(){
            System.out.println(" Area of Rectangle is : "+(dimension*breadth));
        }
        public void setDimension(int a, int b){
            this.dimension = a;
            this.breadth = b;
        }  
    }   
    public static class Triangle extends Shape{
        int dimension;
        int breadth;
        public void area(){
            System.out.println(" Area of Triangle is : "+(0.5*dimension*breadth));
        }
        public void setDimension(int a, int b){
            this.dimension = a;
            this.breadth = b;
        }  
    }
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.area();

        Circle circle = new Circle();
        circle.setRadius(5);
        circle.area();

        Rectangle rectangle = new Rectangle();
        rectangle.setDimension(4, 6);
        rectangle.area();

        Triangle triangle = new Triangle();
        triangle.setDimension(4, 6);
        triangle.area();
    }        
}