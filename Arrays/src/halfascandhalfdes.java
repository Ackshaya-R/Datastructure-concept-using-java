import java.util.*;
public class halfascandhalfdes
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
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>=arr.length/2;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
