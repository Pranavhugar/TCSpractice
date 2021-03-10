import java.lang.*;
import java.util.*;
class Movie1
{
    int movieid,budget,rating;
    String director;
    
    public Movie1(int id,String dir,int rat,int bud)
    {
        this.movieid=id;
        this.director=dir;
        this.rating=rat;
        this.budget=bud;
    }
    public int getmovieid()
    {
        return movieid;

    }
    public void setmovieid(int id)
    {
        this.movieid=id;
    }
    public String getdirector()
    {
        return director;
    }
    void setdirector(String dir)
    {
        this.director=dir;
    }
    public int getrating()
    {
        return rating;
    }
    void setrating(int rat)
    {
        this.rating=rat;
    }
    public int getbudget()
    {
        return budget;
    }
    void setbudget(int bud)
    {
        this.budget=bud;
    }
}
public class Movie
{
    String parameterdir;
    static int avg=0;
    public static int findavgbudgetbydirector(Movie1 [] m,String parameterdir)
    {
        int count=0;
        for(int i=0;i<4;i++)
        {
            if(m[i].director.equals(parameterdir))
            {
                avg+=m[i].budget;
                count++;
            }
        }
        return avg/count;
    }
    public static Movie1 getmoviebyrating(Movie1 [] m,int rat,int bud)
    {
        for(int i=0;i<4;i++)
        {
            if(m[i].rating == rat && m[i].budget==bud)
            {
                if(m[i].budget%m[i].rating==0)
                {
                    return m[i]; 
                }
            }
        }
        return null;
    }
    public static void main(String args[])
    {
        int count=4;
        Scanner sc=new Scanner(System.in);
        Movie1[] m=new Movie1[count];
        for(int i=0;i<4;i++)
        {
            int id=sc.nextInt();
            sc.nextLine();
            String dir=sc.nextLine();
            
            int rat=sc.nextInt();
            
            int bud=sc.nextInt();
            
            m[i]=new Movie1(id,dir,rat,bud);
        }
        sc.nextLine();
        String pardir=sc.nextLine();
        int rat=sc.nextInt();
        int bud=sc.nextInt();
        System.out.println(findavgbudgetbydirector(m, pardir));
        Movie1 temp=getmoviebyrating(m, rat, bud);
        System.out.println(temp.movieid);
    }
}