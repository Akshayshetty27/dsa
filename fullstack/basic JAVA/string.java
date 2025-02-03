class string{
    public static void main(String args[])
    {

        String str= new String("AKSHAY A SHETTY");
        String tr= " helllo " + str;
         System.out.println(" "+tr);


        System.out.println(" "+str);

        System.out.println(" "+str.charAt(2));
        String s[]= str.split(" ");

        for( String st : s)
         System.out.println(" "+st);

         String ap= str.concat(" Brahmavara ");
    System.out.println(" "+ap);

        


    }
}