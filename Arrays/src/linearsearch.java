import java.util.*;
public class linearsearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int targetNum=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean isfound=false;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]==targetNum)
             {
                 System.out.print("The element is found at index:"+i);
                 isfound=true;
             }
        }
        if(!isfound)
        {
            System.out.println("The target number is not found in the given elements");
        }
    }
}
