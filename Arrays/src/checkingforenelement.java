import java.util.*;
public class checkingforenelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean isfound=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2) {
                isfound = true;
                break;
            }
        }
        if(isfound)
        {
            System.out.print("True");
        }
        else {
            System.out.print("false");
        }
    }
}
