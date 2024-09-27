import java.util.Scanner;

class patter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String input,output="";
        System.out.println("enter the input");
        input=sc.next();

        for(int i=0; i<input.length()-1;i=i+2)
        {
        char ch= input.charAt(i);
        int num=0;
        int count= Integer.parseInt(String.valueOf(input.charAt(i+1)));
         while(num <count)
         {
         output += ch;
         num+=1;
         }
        }     

        System.out.println(" "+output);

            }
}