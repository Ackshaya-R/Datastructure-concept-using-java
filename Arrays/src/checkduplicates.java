import java.util.*;
public class checkduplicates {
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
        boolean isfound=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                isfound=true;
                break;
            }
        }

        if(isfound)
        {
            System.out.print("The duplicates is found");
        }
        else {
            System.out.print("The duplicates is not found");
        }
    }
}
