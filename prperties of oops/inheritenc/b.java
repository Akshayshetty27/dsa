class b{
     double l,h,w;
    b()
    {
        this.l=5;
        this.h=3;
        this.w=7;
    }
    // cube
    b(double side)
    {
        this.l=side;
        this.h=side;
        this.w=side;
   }

    static class derived extends b{
     double cost;
    derived()
     {
        super();
        this.cost= 4;
     }       
     derived(double cost)
    {
        super(cost);
        cost= this.cost;

    }
     }
    public static void main(String args[])
    {
// types of  inheritence 
// single inheritence 
// multi inheritence 
// multiple inheritence 
// hybrid inheritence 
derived bb= new derived(5);
System.out.println(""+ bb.cost+ " "+bb.l+" "+bb.w+" "+bb.h);
    
     }}