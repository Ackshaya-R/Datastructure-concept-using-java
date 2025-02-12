import java.util.*;
public class leftrotationofthearrayby1places {
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
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.print(Arrays.toString(arr));
    }
}
