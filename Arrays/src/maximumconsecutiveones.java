import java.util.*;
public class maximumconsecutiveones {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max,count); //update max when count is greater than max;
            }
            else {
                count=0;
            }
        }
        System.out.println(max);
    }
}
