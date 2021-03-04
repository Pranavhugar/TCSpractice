public class javatest
{
    public static void main(String args[])
    {
        int count =0,count1=0;
        String str1="Hello Program";
        for (int i=0;i<str1.length();i++)
        {
            //System.out.print(str1.charAt(i));
            if(str1.charAt(i)==' ')
            {
                count=count+1;
                
            }
            else
            {
                count1=count1+1;

            }

        }
        System.out.println(count);
        System.out.println(count1);
    }

}