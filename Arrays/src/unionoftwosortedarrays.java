import java.util.*;
public class unionoftwosortedarrays {
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int[] arr1=new int[5];
            int[] arr2=new int[6];

            for(int i=0;i<arr1.length;i++)
            {
                arr1[i]=sc.nextInt();
            }

            for(int i=0;i<arr2.length;i++)
            {
                arr2[i]=sc.nextInt();
            }

            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<arr1.length;i++)
            {
                set.add(arr1[i]);
            }
            for(int i=0;i<arr2.length;i++)
            {
                set.add(arr2[i]);
            }

            System.out.print(set);
    }
}
