import java.util.*;
public class copyarray
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
        System.out.println(Arrays.toString(arr));
        int[] copiedarray=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            copiedarray[i]=arr[i];
        }
            System.out.print(Arrays.toString(copiedarray));
    }
}
