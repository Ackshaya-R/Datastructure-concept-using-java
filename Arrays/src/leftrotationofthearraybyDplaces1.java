import java.util.*;
public class leftrotationofthearraybyDplaces1 {//D can be any number;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        d=d%n;    //This is bcoz if the input is 8 and the size world be 7 means 7+1 rotation extra 1 will be takes place we have to consider only that 1 rotation
        int[] temp=new int[d];  // so d=d%n;
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }

        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }

        for(int i=n-d;i<arr.length;i++)
        {
            arr[i]=temp[i-(n-d)];
        }

        System.out.print(Arrays.toString(arr));
    }
}
