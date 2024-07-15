package bank;
class  Account{
   public String name;
   protected String email;
   private String password;
public String getpass(){
    return this.password;
    }
public void getpassword(String pass)
    {
        this.password=pass;
    }
    }

public class Bank{
public static void main(String args[])
{
    Account acc=new Account();
    acc.name=" AKshay ";
    acc.email="shettyakshay333";
    // acc.password="12332";
    System.out.println(" "+acc.name);
}
}