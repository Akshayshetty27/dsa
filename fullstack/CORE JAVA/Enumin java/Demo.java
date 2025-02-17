

public class Demo
{
enum Status{
    Running ,  Failed , Success ;
}
enum Laptop{
    // private int price=3000;

    Macbook(2000), Lenevo(1200) , Xps( 1700) ;
    private int price;
    private Laptop(int price)
    {
        this.price=price;
    }
}
    public static void main(String args[])
    {
        int i=5;
        Status s[]= Status.values();

        Status p= Status.Success;

        if( p== Status.Running)
        {
            System.out.println(" the process is running... please wait ");
        }else if( p==Status.Failed){
            System.out.println(" the process Failed...");

        }else{
            System.out.println(" the process completed");

        }
        for( Status ss : s)
        {
                        System.out.println(ss+" "+ss.ordinal());

        }


        Laptop lap[]= Laptop.values();
for(Laptop l : lap)
        System.out.println(l+" "+l.price);

    }
}



