import java.util.*;
class findavg
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
        int sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
        System.out.println("The sum of the elements is:"+sum);
        double average=sum/arr.length;
        System.out.print("The average of the elements is:"+average);
    }
}


