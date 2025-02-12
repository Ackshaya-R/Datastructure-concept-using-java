import java.util.*;
public class leftarrayrotationbydplaces2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        d=d%n;
        int[] new_arr=new int[arr.length];
        int index=0;
        for(int i=d;i<n;i++)                    //for right rotation place d=n-d
        {
            new_arr[index++]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            new_arr[index++]=arr[i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
