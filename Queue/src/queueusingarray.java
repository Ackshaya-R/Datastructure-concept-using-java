public class queueusingarray { //in this code the space is waste
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int front,rear;
    queueusingarray()
    {
        front=-1;
        rear=-1;
    }
    void enqueue(int val)
    {
        if(rear==MAX_SIZE-1)
        {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front==-1)
            front++;
        arr[++rear]=val;
    }
    int dequeue()
    {
        if(front==-1 || front>rear)
        {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return arr[front++];
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
