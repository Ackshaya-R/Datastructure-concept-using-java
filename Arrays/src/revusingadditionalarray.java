import java.util.*;
public class revusingadditionalarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] rev=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[arr.length-1-i];
        }
        System.out.print(Arrays.toString(rev));
    }
}



