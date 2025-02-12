import java.time.*;
public class stackusingArrays {
    int MAX_SIZE =20;
    int[] arr=new int[MAX_SIZE];
    int top;
    stackusingArrays()//constructor
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

    public static void main(String args[])
    {
        Instant start=Instant.now();
        stackusingArrays stack=new stackusingArrays();
        stack.push(2);
        stack.push(7);
        stack.push(5);
        stack.push(6);
        System.out.println("poped element:"+stack.pop());
        System.out.println(stack.peek());

        Instant end=Instant.now();
        System.out.println("Time elapsed:"+Duration.between(start,end).toMillis()+"Milliseconds");
    }
}
