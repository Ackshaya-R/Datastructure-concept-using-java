package Queue;

public class implementationusingarrays
{
    int MAX_SIZE=20;
    int arr[]=new int[MAX_SIZE];
    int front,rear;
    implementationusingarrays()
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
        implementationusingarrays q=new implementationusingarrays();
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(9);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.front);
        System.out.println(q.rear);
    }
}
