import java.util.*;
public class movingzerodtothefrontofthearray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count--;
            }
        }
        for(int i=0;i<=count;i++)
        {
            arr[i]=0;
        }
        System.out.print(Arrays.toString(arr));
    }
}
