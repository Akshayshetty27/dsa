
import java.io.*;
import java.util.*;

public class ipadressvalidator {
    static boolean check(String str){
         String st[]= str.split("\\.");
        if(st.length > 4  ||  st.length <4){
            return false;
        }
        for( String s : st){
            if( s.length() > 3 )
            {
                return false;
            }
            int num = Integer.parseInt(s);
            if( num < 0  || num > 255 )
            {
                return false ;
            }
   
    }
     return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        
        String str[]=new String[6];
        for( int i=0; i< 6; i++){
            str[i]=sc.next();
        }
        
        for( String st : str)
         {        System.out.println(check(st));
}
         
    }
}
