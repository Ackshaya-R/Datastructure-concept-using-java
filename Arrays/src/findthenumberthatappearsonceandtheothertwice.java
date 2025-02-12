import java.util.*;
public class findthenumberthatappearsonceandtheothertwice {
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
        int result=0;
        for(int num:arr)
        {
            result^=num;
        }

        System.out.println(result);
    }
}
