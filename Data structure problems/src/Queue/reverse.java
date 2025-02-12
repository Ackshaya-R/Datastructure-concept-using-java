package Queue;

public class reverse
{
    int MAX_SIZE=20;
    int arr[]=new int[MAX_SIZE];
    int front,rear;
    reverse()
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

    void reverse()
    {
        if(front==-1)
        {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        for(int i=rear;i>=front;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[])
    {
        reverse q=new reverse();
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(9);
        q.reverse();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

