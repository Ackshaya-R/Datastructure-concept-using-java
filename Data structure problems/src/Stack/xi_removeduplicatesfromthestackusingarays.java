package Stack;

public class xi_removeduplicatesfromthestackusingarays
{
    int MAX_SIZE=10;
    int[] arr=new int [MAX_SIZE];
    int top;
    xi_removeduplicatesfromthestackusingarays()
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


    void display() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stcak underflow");
        }

        for (int i = 0; i <= top; i++)
        {
            boolean isDuplicate=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        xi_removeduplicatesfromthestackusingarays c=new xi_removeduplicatesfromthestackusingarays();
        c.push(6);
        c.push(6);
        c.push(1);
        c.push(5);
        c.push(1);
        c.push(4);
        c.display();
    }
}
