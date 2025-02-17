class Demo
{
    public static void main(String args[])
    {
Alien a= new Alien(27,"Akshay");
Alien  a2= new Alien(0,"");

// var aid= a.getId();
// var aname= a.getName();

// System.out.println(" "+aid + " "+ aname);

System.out.println(a);

    }
}



record Alien(int id , String name)
{
    public Alien(int id , String name){
    if( id == 0)
    {
        throw new IllegalArgumentException("id cannot be zero");
    }
    this.id=id;
    this.name=name;
                                     }


}

// class Alien{
//     private final int id;
//     private final String name;
//     Alien(int id  , String name){
//         this.id= id;
//         this.name= name;
//     }

    // public int getId()
    // {
    //     return this.id;
    // }
    // public String getName()
    // {
    //     return this.name;
    // }
// }