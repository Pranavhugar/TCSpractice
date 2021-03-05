import java.util.*;
public class Sqaurenumbers {
    public static void main(String args[])
    {
        int number,sqr,remainder;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        sqr=number*number;
        
        while(sqr>0){
            sqr=sqr%10;
            if(sqr==number)
        {
            System.out.println("YEAhhhhhhhhhh");
            break;
        }
        //else{
          //  System.out.println("Noooooooooo");
            //break;
        //}
        }
    }
}
