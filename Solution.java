import java.util.*;
class Travel {
    int regno, price;
    String agencyname,packagetype;
    boolean flight;
    public Travel(int r,String n,String pt,int pr,boolean fl)
    {this.regno=r;
        this.agencyname=n;
        this.packagetype=pt;
        this.price=pr;
        this.flight=fl;
    }
    public int getRegno(){
        return regno;
    }
    public void setRegno(int regno)
    {
        this.regno=regno;
    }
    public String getAgencyname(){
        return agencyname;
    }
    public void setAgencyname(String agencyname)
    {
        this.agencyname=agencyname;
    }
    public String getPackagetype(){
        return packagetype;

    }
    public void setPackagetype(String packagetype)
    {
        this.packagetype=packagetype;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public boolean getFlight(){
        return flight;

    }
    public void setFlight(boolean fligth)
    {
        this.flight=flight;
    }
}
public class Solution 
{   
    static int max=0;
    public static int findagencywithhighestpackageprice(Travel[] t)
    {
        for(int i=0;i<t.length;i++)
        {if(max==0)
            {
                max=t[i].getPrice();
            }
            else if(t[i].getPrice()>max)
            {
                max=t[i].getPrice();
            }
            
        }
        return max;
    }
    public static void agencydetailsforgivenidandtype(Travel[] t,int regno, String packagetype)
    {
        for(int j=0;j<4;j++)
        {
            if(t[j].regno==regno && t[j].packagetype.equals(packagetype))
            {
                System.out.println(t[j].getAgencyname()+":"+ t[j].getPrice());
            }
        }
    }
    public static void main(String args[])
    {
        int count=4;
        Scanner sc=new Scanner(System.in);
        Travel[] t=new Travel[count];
        for(int i=0;i<4;i++)
        {int reg=sc.nextInt();
        sc.nextLine();
        String agn=sc.nextLine();
        String pt=sc.nextLine();
        int pr=sc.nextInt();
        boolean fli=sc.nextBoolean();
        t[i]=new Travel(reg,agn,pt,pr,fli);
        }
        int reg=sc.nextInt();
        sc.nextLine();
        String ptn=sc.nextLine();
        System.out.println(findagencywithhighestpackageprice(t));
        agencydetailsforgivenidandtype(t,reg,ptn);
    }
    

}
