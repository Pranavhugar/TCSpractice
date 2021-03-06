import java.util.*;
import jdk.jfr.Percentage;
class Navalvessel
{
    int vesselid,noofvoyagesplanned,noofvoyagescompleted,percentage;
    String vesselname,purpose,classification;
    public Navalvessel(int id,String name,int planned,int completed,String pur)
    {
            this.vesselid=id;
            this.vesselname=name;
            this.noofvoyagesplanned=planned;
            this.noofvoyagescompleted=completed;
            this.purpose=pur;
    }
}
public class Solution2 {
    int parameterper,parameterpur;
    static int avg=0;
    public static int findavgvoygesbypct(Navalvessel[] n,int parameterper)
    {
        int count=0;
        for(int i=0;i<4;i++)
        {
            n[i].percentage=((n[i].noofvoyagescompleted*100)/n[i].noofvoyagesplanned);
        }
        for(int i=0;i<4;i++)
        {
            if(n[i].percentage>=parameterper)
            {
                avg+=n[i].noofvoyagescompleted;
                count++;
            }
        }
        return avg/count;
    }
    public static void findvesselbygrade(String parameterpur,Navalvessel[] n)
    {
        for(int i=0;i<4;i++)
        {
            if(n[i].percentage==100)
            {
                n[i].classification="Star";
            }
            else if(n[i].percentage>=80 && n[i].percentage<=90)
            {
                n[i].classification="Leader";
            }
            else if(n[i].percentage>=55 && n[i].percentage<=79)
            {
                n[i].classification="Inspirer";
            }
            else
            {
                n[i].classification="Striver";
            }
        
        }
        for(int i=0;i<4;i++)
        {
            if(n[i].purpose.equals(parameterpur))
            {
                System.out.println(n[i].vesselname+"%"+n[i].classification);
                break;
            }
        }

    }
    public static void main(String args[])
    {
        int count=4;
        Scanner sc=new Scanner(System.in);
        Navalvessel[] n=new Navalvessel[count];
        for(int i=0;i<4;i++)
        {
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int pla=sc.nextInt();
            int com=sc.nextInt();
            sc.nextLine();
            String pu=sc.nextLine();
            n[i]=new Navalvessel(id,name,pla,com,pu);
        }
        int id=sc.nextInt();
        sc.nextLine();
        String nm=sc.nextLine();
        System.out.println(findavgvoygesbypct(n,id));
        findvesselbygrade(nm,n);
    }
}
