import java.util.Scanner;

public class  dectobin {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a decimal number: ");

        // int decimal = scanner.nextInt();
        // String binary = Integer.toBinaryString(decimal);
        // System.out.println("Binary representation: " + binary);

        // String togglebinary="";
        // for( int i=0; i< binary.length(); i++)
        // {
        //     if( binary.charAt(i)== '0')
        //     {
        //         togglebinary += '1';
        //     }else{
        //         togglebinary +='0';
        //     }
        // }

        // int number = Integer.parseInt(togglebinary ,2);
        // System.out.print(" "+number);
        
        // System.out.print("Enter a binary number: ");
        // String binaryInput = scanner.next();
        // int decimalOutput = Integer.parseInt(binaryInput, 8);
        // System.out.println("Decimal representation: " + decimalOutput);

        // scanner.close();
        int number=10;
String str="";
int count =0;
 boolean y= true;
 while(y)
 {
        if(  Math.pow(2,count)  < number  )
        {
            count++;
        }
        else{
            y=false;
        }
 }


System.out.println(""+count);
int c=0;

for( int i=0; i<count ;i++)
{
    if( number % Math.pow(2,(++c)) == 0 )
    {
        str = '0'+ str;
    }else{
        number = number - (int)(Math.pow(2,i));
        str = '1'+str;
    }

}

System.out.println(" "+number +" = "+str);

String toggle="";

for( int i=0; i< str.length(); i++)
        {
            if( str.charAt(i)== '0')
            {
                toggle += '1';
            }else{
                toggle +='0';
            }
        }

        System.out.println(" "+toggle);

int n=0;

for( int i=0 ; i< str.length();i++)
{
    if( str.charAt(i) == '1')
    {
        n += (int)Math.pow(2, i);
    }

}

System.out.println(" "+n);

}
}
