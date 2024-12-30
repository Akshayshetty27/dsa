class reverseAll
{
    public static void main(String args[])
{
    String str="Write a program to demonstrate the use of an ArrayList to store and retrieve data";

    String split[]=new String[100];

    split=str.split(" ");
    String temp="";
    for(String st : split)
    {
        for(int i=0; i<st.length();i++)
        {
    temp += st.charAt(st.length()- i -1);


        }
        System.out.println(st+" --> "+temp);
        temp="";
    }


}
}