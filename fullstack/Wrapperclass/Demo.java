class Demo
{
    public static void main(String aregs[])
    {

        int num= 7;
        // num1  is  object instance of Integer class 
        Integer num1 = num; // Auto Boxing 
        int num2 = num1.intValue();  //  unboxing 
        System.out.println(" "+num+" "+num1+" "+num2);

        String str= "12";
        //    System.out.println( (str) * 2);
        int n= 2 * (Integer.parseInt(str));

        System.out.println(" "+ n);
    }
}