class A 
{
    double l,h,w;
    A()
    {
        this.l=5;
        this.h=3;
        this.w=7;
    }
    // cube
    A(double side)
    {
        this.l=side;
        this.h=side;
        this.w=side;
    }

    //rectanfle 
    A(double l , double h ,double w)
    {
        this.l=l;
        this.h=h;
        this.w=w;
    }

   static public class box extends A 
    {
        double Weight;
        box()
        {
            this.Weight=13;
            // this.l=3;
            // this.w=7;
            // this.h=4;
        }
    }

    public static void main(String args[])
{// inheritence:
 // similar to parent -> child relationship.
 // child class inherit the properties of the parent class 
 // using extends keyword //
 // syntax  :  childclass extends base(parent )class { }
 // child class can have the properties of the base class and additional with it .
 
A bo= new A(5 , 3 ,4 );
A box2 = new A(5);

System.out.println(" "+bo.l+ " "+bo.h +" "+ bo.w);

System.out.println(" "+box2.l+ " "+box2.h +" "+ box2.w);
box we= new box();
System.out.println(" "+we.Weight+ " "+ we.l +" "+ we.h +" "+ we.w);

// there are many variables in both  parent and child classes 
// you are  given access to variavles that  are  in the ref  type i.e . Boxweigth 
// hence  you should  have access mto weight  variable 
// this also means  that  the ones  you are trying to access should be initialized 
// but heree , when  the obj itself  is type of class 




}}