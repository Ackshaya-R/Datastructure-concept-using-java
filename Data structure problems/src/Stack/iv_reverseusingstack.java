package Stack;

public class iv_reverseusingstack
{
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int top;
    iv_reverseusingstack ()
    {
        top=-1;
    }

    void push(int val)
    {
        if(top==MAX_SIZE-1)
        {
            throw new IndexOutOfBoundsException("Stack overflow");
        }
        arr[++top]=val;
    }

    int pop()
    {
        if(top==-1)
        {
            throw new IndexOutOfBoundsException("Stack underflow");
        }
        return arr[top--];
    }

    int peek()
    {
        return arr[top];
    }

    boolean isEmpty()
    {
        return top==-1;
    }
    void reverse()
    {
        int[] revarr=new int[MAX_SIZE];

        int index=0;
        while(!isEmpty())
        {
            int temp=pop();
            revarr[index++]=temp;
        }
        for(int i=index-1;i>=0;i--)
        {
            push(revarr[i]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else {
            for(int i=top;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        iv_reverseusingstack s=new iv_reverseusingstack ();
        s.push(8);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);


        System.out.println("After reverse");
        s.display();
    }

}
