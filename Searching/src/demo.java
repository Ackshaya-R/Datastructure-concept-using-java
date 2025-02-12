import java.util.*;
public class demo
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

        System.out.println(Linearserach.find(arr,7));
        System.out.println(Linearserach.contains(arr,7));
        System.out.println(Linearserach.find("Ackshaya",'y'));
        System.out.println(Linearserach.contains("Abi",'b'));

        int[][] twoarr={
                {1,6,3},
                {3,9,2},
                {0,7,4}
        };

        int[] result=Linearserach.find(twoarr,1);
        System.out.println(Arrays.toString(result));
    }
}
