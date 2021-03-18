import java.util.Scanner;

class AutonomousCar
{
    int carid,nooftestsconducted,nooftestspassed;
    String brand,environment,grade;

    AutonomousCar(int id,String br,int testc,int testp,String env)
    {
        this.carid=id;
        this.brand=br;
        this.nooftestsconducted=testc;
        this.nooftestspassed=testp;
        this.environment=env;
    }    
}

public class Solution4 {
    String parameterenv,parameterbrand;
    static int sum=0;
    
    public static int findtestpassedbyev(AutonomousCar[] a,String parameterenv)
    {
    
        for(int i=0;i<a.length;i++)
        {
            if(a[i].environment.equalsIgnoreCase(parameterenv))
            {
                sum+=a[i].nooftestspassed;
            }
        }
        return sum;
    }
    public static AutonomousCar updatecargrade(AutonomousCar[] a,String parameterbrand)
    {
        int rating;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].brand.equalsIgnoreCase(parameterbrand))
            {
                rating=(a[i].nooftestspassed*100)/a[i].nooftestsconducted;
                if(rating >=80)

                {
                    a[i].grade="A1";
                }
                else
                {
                    a[i].grade="B2";
                }
            return a[i];
            }
        }
        return null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        AutonomousCar[] a=new AutonomousCar[4];
        for(int i=0;i<4;i++)
        {
        int id=sc.nextInt();
        sc.nextLine();
        String br=sc.nextLine();
        int testc=sc.nextInt();
        int testp=sc.nextInt();
        sc.nextLine();
        String env1=sc.nextLine();
        a[i]=new AutonomousCar(id,br,testc,testp,env1);
        }
        String penv=sc.nextLine();
        String brand=sc.nextLine();
        int temp=findtestpassedbyev(a, penv); 

        if(temp==0)
        {
            System.out.println("There is no tests passed in this particular");
        }
        else{
        System.out.println(temp);
                }
        AutonomousCar temp1=updatecargrade(a, brand);
        if(temp1==null)
        {
            System.out.println("No car is available with the specified brand");
        }
        else
        System.out.println(temp1.brand+"::"+temp1.grade);
    }

}
