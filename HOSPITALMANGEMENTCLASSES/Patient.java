package Hospital_mangement_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {


        private Connection connection;
        private Scanner scanner;

        public  Patient( Connection connection , Scanner scanner)
        {
            this.connection= connection;
            this.scanner= scanner;
        }

        public  void  addPatient( )
        {
            System.out.println(" enter Patient name ");
            String  name= scanner.next();
            System.out.println(" enter patient age ");
            int age = scanner.nextInt();
            System.out.println(" enter patient gender");
            String gender = scanner.next();

            try
            {
                String query= " INSERT INTO patients( name ,age ,gender ) VALUES (? ,? ,?) ";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString( 1 , name);
                preparedStatement.setInt(2,age);
                preparedStatement.setString(3,gender);

                int affectedrow = preparedStatement.executeUpdate();
                if( affectedrow > 0 )
                {
                    System.out.println(" Patient added successfully");
                }else {
                    System.out.println(" failed to add patient ");
                }

            }catch ( SQLException e)
            {
                e.printStackTrace();
            }
        }

        public void viewPatient()
        {

            String query = " SELECT * FROM patients";

            try{

                PreparedStatement preparedStatement = connection.prepareStatement((query));
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println( "patients: ");
                System.out.println("+------------|--------------------|------------|-------------- + ");
                System.out.println("| Patient id | Name               | AGE        | GENDER        |");
                System.out.println("+------------|--------------------|------------|-------------- + ");

                while ( resultSet.next())
                {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String gender = resultSet.getString("gender");
                    System.out.printf("|%-12s|%-20s|%-10s|%-12s|\n",id,name,age,gender);
                    System.out.println("+------------|--------------------|------------|-------------- + ");


                }



            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        public  boolean getPatientbyid(int id) {
            String query = "Select * From patients where id=?";

            try{
                PreparedStatement preparedStatement =  connection.prepareStatement(query);
                preparedStatement.setInt(1,id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next())
                {
                    return true;
                }
                else {
                    return false;
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
                return false;
            }
        }

}
