class Bank
{
    static int count=0;


    class Bankholder{
        String name;
        double amount;

        Bankholder(String name, double amount)
        {
            this.name=name;
            this.amount=amount;
            count+=1;
         }
       void  Creditamount(double newamount)
        {
       this.amount +=newamount;
        }
       void  Withdraw( double reqamount)
        {
            if(reqamount > this.amount)
            {
                System.out.println(" The required amount is more than saving amount ");
            }else
            {
                this.amount -=reqamount;
                System.out.println(" the new amount available is :"+amount);
            }
        }

       void Checkamount()
        {
            System.out.println(" the amount available in your account "+this.amount);
        }


    }
    public static void main(String args[ ])
    {
        Bank bank= new Bank();
        Bank.Bankholder b1= bank.new Bankholder("akshay",300);
        b1.Withdraw(100);
        
        b1.Checkamount();


    }
}

