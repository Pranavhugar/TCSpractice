import java.util.*;
class Faculty {
    int id,age;
    String name,designation,stream;
    double salary;
    public Faculty(int a,String b,double c,String d,int e,String s)
    {
        this.id=a;
        this.name=b;
        this.salary=c;
        this.designation=d;
        this.age=e;
        this.stream=s;
    }

}
class Faculty1
{
    public static int inp; 
    public static Faculty findfacultywithsecondlargestsalary(Faculty f[])
    {
        double arr[] = new double[inp];
        for(int i=0;i<inp;i++)
        {
            arr[i]=f[i].salary;
        }
        Arrays.sort(arr);
        for(int i=0;i<inp;i++)
        {
            if(arr[inp-2]==f[i].salary)
            return f[i];
        }
        return null;
    }
    public static Faculty findfourthlargestfacultybyage(Faculty f[])
    {
        int arr[]=new int[inp];
        for(int i=0;i<inp;i++)
        {
            arr[i]=f[i].age;
        }
        Arrays.sort(arr);
        for(int i=0;i<inp;i++)
        {
            if(arr[inp-4]==f[i].age)
            return f[i];
        }
        return null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        inp=sc.nextInt();
        Faculty[] f=new Faculty[inp]; 
        for(int i=0;i<inp;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble();
            sc.nextLine();
            String d=sc.nextLine();
            int e=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            f[i]=new Faculty(a,b,c,d,e,s);
        }
        Faculty f1=findfacultywithsecondlargestsalary(f);
        Faculty f2=findfourthlargestfacultybyage(f);
        System.out.println("id:"+f1.id+"\nname:"+f1.name+"\nsalary:"+f1.salary+"\ndesignation:"+f1.designation+"\nage:"+f1.age+"\nstream:"+f1.stream);
        System.out.println("id:"+f2.id+"\nname:"+f2.name+"\nsalary:"+f2.salary+"\ndesignation:"+f2.designation+"\nage:"+f2.age+"\nstream:"+f2.stream);
    }
}
