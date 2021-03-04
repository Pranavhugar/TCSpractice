/*class practice
{
    public static void main(String args[])
    {
        int number,product=1,count=0;
        number =Integer.parseInt(args[0]);
        //System.out.println(number);
        while(number!=0)
        {
            product= product*(number%10);
            number=number/10;   
            count+=1;
        }       
        if(count==4)
        {
                System.out.println(product);
        } 
        else
        { 
            System.out.println("Enter four digit number only");
        }

    }
}*/
import java.util.*;
class practice 
{
    public static void main(String args[])
    {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
        if(a.charAt(i)=='5')
        {
            if(a.charAt(i+1)=='3')
            {
                a=a.replace("53","");
            }
        }
        else if(a.charAt(i)=='8')
        {
            a=a.replace("8","");
        }
        
        else{
            continue;
        }
    }
    System.out.println(a.toLowerCase());

    }
}