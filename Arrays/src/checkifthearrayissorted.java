import java.util.*;
public class checkifthearrayissorted {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean issort=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                issort=false;
                break;
            }
        }

        if(issort)
        {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
