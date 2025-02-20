
package com.mycompany.mavenproject1;

import java.sql.*;
public class Mavenproject1 {

    public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.jdbc.Driver");
       
       String url ="jdbc:mysql://localhost:3307/dbname";
       String uname="root";
       String pass="";
       String query="select username from students where uid=3 ";
       Connection con = DriverManager.getConnection(url ,uname , pass);
       Statement s= con.createStatement();
       ResultSet rs = s.executeQuery(query);
       rs.next(); // to fetch the next element 
       String name = rs.getString(uname);
    
       System.out.println(name);
     
       String query1="select username from students";
       
     
       
       
//          print the  all data of the table  onr row by row 
       while(rs.next())
       {
           String userdata= rs.getInt(1)+ rs.getString(2);// will give row data
           
       }
       
       
       // inserting a values into datatable using java 
       int userid= 5;
       String namee= "rohani";// inserting values dynamically to the database 
       
       String query2= " Insert into values ("+ userid + "," + namee +  ")";
       
       int count = s.executeUpdate(query2);
       
       System.out.println("");
       
       
       
     
       s.close();
       con.close();        
    }
}
