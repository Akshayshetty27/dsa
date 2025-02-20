import java.sql.*;
public class D {
    public static void main(String args[])throws Exception 
    {
        Class.forName("Pqr").newInstance();

        DriverManager.registerDriver(driver);
                // Pqr p = new Pqr();

    }
}

class Pqr 
{
    static{
        System.out.println(" in static block");
    }
    {
        System.out.println(" in instance block ");
    }
}