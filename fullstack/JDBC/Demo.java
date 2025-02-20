import java.sql.*;

class Demo {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Change this
        String user = "your_username"; // Change this
        String password = "your_password"; // Change this

        try {
            // ✅ Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ✅ Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL successfully!");

            // ✅ Close Connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
