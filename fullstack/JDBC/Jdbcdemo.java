class Jdbcdemo
{
    public  static void main(String args[])
    {

StudentDAO da= new StudentDAO();
Student s1=  da.getStudent(12);
System.out.println(" "+s1.name);

    }
}

class StudentDAO{
    public  Student getStudent(int roll)
    {
        
Class.forName(" driver name ");
Connection con = DriverManager.getConnection(url , username , password);
Statement s= con.createStatement();
String query= " select * from the students where id=3 ";
rs.next();
ResultSet rs = s.executteQyery(query);
System.out.println(" "+rs.getInt(1) +
 " "+ rs.getString());


    Student s= new Student();
    s.roll= roll;
    s.name
    return s;
    }
}
class Student{
    int roll;
    String name;

}