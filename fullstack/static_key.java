class static_key{
      public static void main(String args[])
    {
        Mobile m1= new Mobile(34000,"5g","Redmi ");
   
       

        Mobile m2= new Mobile(110000,"5g", "SAMSUNG");
        Mobile.show(m1);
    
       m1.print_de();
        m2.print_de();
    }
}

  class Mobile{
      static String  name;
        int price;
        String network;
        String brand ;
        static{
         name=" Smart Phone";
        }
        Mobile( int price, String network,String brand)
        {
            this.price=price;
            this.network=network;
            this.brand=brand;
        }
          public void print_de( )
         {
            System.out.println("brand :"+brand+" "+name+" network :" + network+" price "+price);
         }
         static public void show(Mobile obj)
         {
              System.out.println("brand :"+obj.brand+" "+name+" network :" + obj.network+" price "+obj.price);
         }
    }