import java.util.*;
public class nextgreaterelementinanarray
{
    public static void nextgreater(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean isfound=false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    System.out.println("The next element for the "+arr[i]+" is "+arr[j]);
                    isfound=true;
                    break;
                }
            }
            if(!isfound)
            {
                System.out.println("The next greater element for "+arr[i]+" is -1");
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        nextgreater(arr);
    }
}
