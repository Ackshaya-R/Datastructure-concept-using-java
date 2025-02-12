package Stack;

public class vi_removeall
{
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int top;
    vi_removeall()
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
    void removeall()
    {
        top=-1;
    }

    void display()
    {
        if(top==-1)
        {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else {
            for(int i=0;i<=top;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        vi_removeall s=new vi_removeall();
        s.push(8);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println("Before removing all the elements:");
        s.display();
        //s.removeall();

        System.out.println("After removing all the elements:");
        System.out.println(s.isEmpty());

    }
}

