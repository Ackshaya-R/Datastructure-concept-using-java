import java.util.*;
class checkpalindromeornot
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
        System.out.println(Arrays.toString(arr));
        boolean ispalindrome=false;
        int[] rev=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
           rev[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(rev));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==rev[i])
            {
                ispalindrome=true;
                break;
            }
        }

        if(ispalindrome)
        {
            System.out.println("The given elements are palindrome");
        }
        else {
            System.out.println("The given elements are not palindrome");
        }
    }
}
