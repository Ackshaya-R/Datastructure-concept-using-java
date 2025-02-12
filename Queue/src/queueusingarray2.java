public class queueusingarray2 // to reduce the waste space in the array S o we are shifting one step front after dequeue the 1 element
{
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int rear;
    queueusingarray2()
    {
        rear=-1;
    }
    void enqueue(int val)
    {
        if(rear==MAX_SIZE-1)
        {
            throw new IndexOutOfBoundsException("Queue is full");
        }

        arr[++rear]=val;
    }
    int dequeue()
    {
        if(rear==-1)
        {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int temp=arr[0]; //the 0th index only delete and it will be return so it is stored in the temp varaibale

        for(int i=1;i<=rear;i++)
        {
            arr[i-1]=arr[i];   //shifting one step front to avoid to take more space
            rear--;
        }
        return temp;
    }

    public static void main(String args[])
    {
        queueusingarray q=new queueusingarray();
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
