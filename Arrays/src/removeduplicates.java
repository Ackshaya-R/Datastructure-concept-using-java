import java.util.*;
public class removeduplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Set<Integer> UniqueNumbers=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            UniqueNumbers.add(arr[i]);
        }
        for(int num:UniqueNumbers)
        {
            System.out.print(num+" ");
        }
    }
}
