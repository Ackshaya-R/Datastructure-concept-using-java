import java.util.*;
public class missingnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=n*(n+1)/2;
        int s2=0;
        for(int i=0;i<arr.length;i++)
        {
            s2+=arr[i];
        }
        System.out.println(sum-s2);
    }
}
