public class Linearserach
{
    //Search an integer element in an given array
    public static int find(int[] arr,int target) //to get the target index
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static boolean contains(int[] arr,int target) //checking the value is present or not
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return true;
        }
        return false;
    }

    // Search an character in a given string
    public static int find(String str,char target)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String str,char target)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                return true;
            }
        }
        return false;
    }

    //Search in a 2D array
    public static int[] find(int[][] arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int column=0;column<arr[row].length;column++)
            {
                if(arr[row][column]==target)
                {
                    return new int[] {row,column};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
