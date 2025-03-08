class Leap_year
{
    public static void main(String args[])
    {
        int year=2200;
        if(year % 400  == 0 && year % 4 ==0)
        {
            System.out.println(" "+year+" is a leap year");
        }else if( year % 4 ==0  && year % 100 !=0)
        {
            System.out.println(" "+year+" is a leap year ");
        }else{
            System.out.println(" it is not a leap year");
        }

    }
}

// 2024
// 2020
// 2016
// 2012
// 2008
// 2004
// 2000
// 1996
// 1992
// 1988