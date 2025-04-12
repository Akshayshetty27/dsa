package Hospital_mangement_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Doctor {

    private Connection connection;
    private Scanner scanner;

    public  Doctor(Connection connection )
    {
        this.connection= connection;
        this.scanner= scanner;
    }

    public void viewDoctor()
    {

        String query = " SELECT * FROM DOCTOR";

        try{

            PreparedStatement preparedStatement = connection.prepareStatement((query));
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println( "DOCTORs: ");
            System.out.println("+------------|--------------------|------------------------- + ");
            System.out.println("| DOCTOR id | Name               | SPECIALIZATION               |");
            System.out.println("+------------|--------------------|------------------------ + ");

            while ( resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialization= resultSet.getString("specialization");
                System.out.printf("|%-12s|%-20s|%-20s|\n",id,name,specialization);
                System.out.println("+------------|--------------------|------------------------ + ");


            }



        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public  boolean getDoctorbyid(int id) {
        String query = "Select * From doctor  where id=?";

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
