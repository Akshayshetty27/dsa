import java.util.Scanner;
public class calculator{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int input1,input2;
        int result;
        char operator;
        while(true)
        {
            input1=sc.nextInt();
            input2=sc.nextInt();
            operator=sc.nextChar();
            switch(operator)
            {
                case '+': 
                         result=input1+input2;
                         System.out.println(" "+result);
                         break;
                case '-': 
                         result=input1-input2;
                         System.out.println(" "+result);
                         break;
                case '*': 
                         result=input1*input2;
                         System.out.println(" "+result);
                case '/': 
                if(input2==0){
                    break;
                }
                         result=input1/input2;
                         System.out.println(" "+result);
                         break;
                case '%': 
                         result=input1%input2;
                         System.out.println(" "+result);
                         break;  
                default:
                             System.out.println("invalid operator");
                            
            }
        }
    }
}