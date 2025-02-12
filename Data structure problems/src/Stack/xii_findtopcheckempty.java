package Stack;

public class xii_findtopcheckempty
{
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int top;
    xii_findtopcheckempty()
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

    public static void main(String args[])
    {
        xii_findtopcheckempty s=new xii_findtopcheckempty();
        s.push(8);
        s.push(4);
        s.push(3);
        s.pop();
        System.out.println("The top most element is:"+s.peek());
        System.out.println(s.isEmpty());
    }

}
