import java.util.*;
public class findduplicatesandprinttheduplicates {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();                         //This code will work if the duplicates is in the adjacent order if the
                                                    // if the numbers is in non-ascending or non-descending means ? we can use hashset
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
