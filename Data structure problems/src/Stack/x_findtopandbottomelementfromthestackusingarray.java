package Stack;

public class x_findtopandbottomelementfromthestackusingarray
{
    int MAX_SIZE=10;
    int[] arr=new int [MAX_SIZE];
    int top;
    x_findtopandbottomelementfromthestackusingarray()
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
    void findtopandbottom()
    {
        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else {
            System.out.println("The top of the element is:"+arr[top]);
            System.out.println("The bottom of the element is:"+arr[0]);
        }
    }

    void display() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stcak underflow");
        }

        for (int i = 0; i <= top; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        x_findtopandbottomelementfromthestackusingarray c=new x_findtopandbottomelementfromthestackusingarray();
        c.push(6);
        c.push(1);
        c.push(5);
        c.push(4);
        c.display();
        c.findtopandbottom();
    }
}
