class buffer{
    public static void main(String args[])
    {
        StringBuffer sb= new StringBuffer(" Akshay ");
        sb.append(" shetty");

        System.out.println(sb+" "+sb.length()+" "+ sb.capacity());
        String str= sb.toString();
        System.out.println(" "+str+" "+str.length());
        
    }
}