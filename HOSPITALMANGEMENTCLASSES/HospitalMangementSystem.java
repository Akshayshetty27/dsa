package Hospital_mangement_system;

import com.mysql.cj.jdbc.Driver;

import javax.print.Doc;
import java.sql.*;
import java.util.Scanner;

public class HospitalMangementSystem
{

    private  static  final  String url= "jdbc:mysql://localhost:3306/hospital";
    private  static  final  String username="root";
    private static  final  String password="Jaishreeram@07";

    public static  void  main(String args[])
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection(url ,username,password);
            Patient patient = new Patient(connection , scanner);
            Doctor doctor = new Doctor(connection );

            while (true)
            {
                System.out.println(" HOSPITAL MANGEMENT SYSTEM ");
                System.out.println("1. Add Patients");
                System.out.println("2. View patient");
                System.out.println("3. view doctor");
                System.out.println("4. book appointment");
                System.out.println("5. exit ");

                System.out.println(" enter user choice");
                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1: // addpatient;
                        patient.addPatient();
                         break;
                    case 2:
                        //view patient
                        patient.viewPatient();
                        break;
                    case 3:
                        // view doctor
                        doctor.viewDoctor();
                        break;
                    case 4:
                        // book apointment
                        bookAppointment(connection ,scanner ,patient ,doctor);

                    case 5:
                        return;

                    default:
                        System.out.println(" enter valid choice ");
                }

            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }


    }
    public  static  void  bookAppointment(Connection connection , Scanner scanner , Patient patient ,Doctor doctor)
    {
        System.out.println(" enter patient id :");
        int patientid= scanner.nextInt();
        System.out.println(" enter doctor id");
        int doctorid= scanner.nextInt();

        System.out.println(" enter appointment date (YYYY/ MM / DD )  \n  ");

        String appointmentdate = scanner.next();

        if( patient.getPatientbyid(patientid) && doctor.getDoctorbyid(doctorid))
        {
            if( checkdoctoravailibility(doctorid , appointmentdate,connection))
            {
String appointmentquery = "INSERT into appointment(PATIENT_ID,DOCTOR_ID,APPOINTMENT_DATE) values(?,?,?)";
try {
    PreparedStatement preparedStatement = connection.prepareStatement(appointmentquery);
    preparedStatement.setInt(1,patientid);
    preparedStatement.setInt(2,doctorid);
    preparedStatement.setString(3,appointmentdate);

    int affectedroe = preparedStatement.executeUpdate();
    if( affectedroe  > 0)
    {
        System.out.println(" appointment booked ");
    }else {
        System.out.println("Failed to book an appointment ");
    }
}catch (SQLException e)
{
    e.printStackTrace();
}

            }
            else {
                System.out.println(" doctor not available ");

            }

        }else {
            System.out.println(" either patient or doctor id  doesnt exist ");
        }


    }
    public static boolean checkdoctoravailibility(int doctorid , String appointmentdate, Connection connection){
        String query=" SELECT COUNT(*) FROM  appointment where DOCTOR_ID= ? AND APPOINTMENT_DATE= ? ";
      try {
          PreparedStatement preparedStatement= connection.prepareStatement(query);
          preparedStatement.setInt(1,doctorid);
          preparedStatement.setString(2,appointmentdate);
          ResultSet resultSet= preparedStatement.executeQuery();
          if(resultSet.next())
          {
              int count = resultSet.getInt(1);
              if(count ==0 )
              {
                  return true;
              }
              else {
                  return  false;

              }
          }

      }catch (SQLException e)
      {
          e.printStackTrace();
          return false;
      }
        return false;
    }
}
