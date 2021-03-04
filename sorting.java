import java.util.*;
public class sorting {
    public static void main(String args[])
    {
        int temp,i,count=0;
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for (i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int nthelement= sc.nextInt();
        for(i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            count++;
            if(count==nthelement+1)
            {
                System.out.println(arr[nthelement-1]);
                break;
            }
        }
    }
}
