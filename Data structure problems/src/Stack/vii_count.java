package Stack;

public class vii_count
{
    int MAX_SIZE=10;
    int[] arr=new int [MAX_SIZE];
    int top;
    vii_count()
    {
        top=-1;
    }

    void push(int val)
    {
        if(top==MAX_SIZE-1)
        {
            throw new IndexOutOfBoundsException("Stack is full");
        }
        arr[++top]=val;
    }

    int pop()
    {
        if(top==-1)
        {
            throw new IndexOutOfBoundsException("Stcak underflow");
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

    void display()
    {
        if(top==-1)
        {
            throw new IndexOutOfBoundsException("Stcak underflow");
        }
        int count=0;
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
            count++;
        }
        System.out.println();
        System.out.println(count);            //another method: int count()
    }                                                         //return top+1;  and call this method in main this also works

    public static void main(String args[])
    {
        vii_count c=new vii_count();
        c.push(6);
        c.push(2);
        c.push(1);
        c.push(5);
        c.display();
    }
}
