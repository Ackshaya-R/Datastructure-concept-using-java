import java.util.*;
public class finddupliactes2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if(seen.contains(arr[i]))
            {
                duplicates.add(arr[i]);
            }
            else {
                seen.add(arr[i]);
            }
        }
        System.out.print("The duplicate elements are:");
        for(int num:duplicates)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.print("The non-duplicate elements are:");
        for(int nums:seen)
        {
            System.out.print(nums+" ");
        }
    }
}
