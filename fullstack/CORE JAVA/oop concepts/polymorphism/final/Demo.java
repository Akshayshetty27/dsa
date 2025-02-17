class Demo{
    public static void  main(String args[])
    {
        // final variable 

         final int  num =8;
         System.out.println(" "+num);
        //  num=5 ;   not Possible 

        A obj = new A();
        obj.show();
        obj.add(4,9);


    }
}

class A {
     public final void show()
     {
    System.out.println(" in   A show ");
 
     }
     public void add(int a , int b){
        System.out.println(" In A add method  : "+ (a+ b));
     }
}
class B extends A{
     public void show()
     {
    System.out.println(" in B show ");

     }


}

