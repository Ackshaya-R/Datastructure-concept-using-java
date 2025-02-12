public class Binarysearch {
    public static int find(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        boolean asc=false;
        if(arr[start]<arr[end])
            asc=true;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(asc) {
                if (target > arr[mid]) //focus on right
                {
                    start = mid + 1;
                } else if (target < arr[mid])// focus on left
                {
                    end = mid - 1;
                } else {
                    return mid;// if target and mid is equal we find the element in the array so return mid....
                }
            }

                else
                {
                    if (target > arr[mid]) //focus on left
                    {
                        end=end-1;
                    } else if (target < arr[mid])// focus on right
                    {
                        start=start+1;
                    } else {
                        return mid;// if target and mid is equal we find the element in the array so return mid....
                    }
                }
        }
        return -1;
    }
}
