import java.util.*;
public class minelement {
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
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The minimum element in the array is:"+min);
        System.out.println("The maximum element in the array is:"+max);
    }
}

