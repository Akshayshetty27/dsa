import java.util.Scanner;


class string
{
    public static void main (String args[]){

Scanner sc =new Scanner(System.in);
//  declaration of string builder
StringBuilder  sb= new StringBuilder("Tony");
System.out.println(sb.charAt(0));
sb.insert(0,'S');
System.out.println(sb);
sb.setCharAt(1,'P');

System.out.println(" after changing character at particular position :"+sb);
System.out.println();
sb.insert(3,'n');
System.out.println("after inserting :"+sb);

sb.delete(3,sb.length());
System.out.println(" after deletion :"+sb);
// sb.append("o");
sb.append("n");
sb.append("n");
sb.append("y");
System.out.println(" after appending :"+sb);
    }
}