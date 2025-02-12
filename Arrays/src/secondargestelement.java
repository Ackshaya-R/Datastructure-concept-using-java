import java.util.*;
public class secondargestelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2)
        {
            System.out.print("Array must have atleast 2 elements");
        }
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int secondlargest=arr[arr.length-2];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondlargest)
            {
                System.out.print(secondlargest);
            }
        }
    }
}
