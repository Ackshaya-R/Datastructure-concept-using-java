package Stack;

public class iii_sortelementsindesorderusingstack
{
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int top;
    iii_sortelementsindesorderusingstack()
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
    void sort()
    {
        iii_sortelementsindesorderusingstack tempStack=new iii_sortelementsindesorderusingstack();

        while(!isEmpty())
        {
            int temp=pop();

            while(!tempStack.isEmpty() && tempStack.peek()<temp)
            {
                push(tempStack.pop());
            }

            tempStack.push(temp);
        }


        while(!tempStack.isEmpty())
        {
            push(tempStack.pop());
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
        iii_sortelementsindesorderusingstack s=new iii_sortelementsindesorderusingstack();
        s.push(8);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);


        s.sort();

        System.out.println("After sorting");
        s.display();
    }
}
