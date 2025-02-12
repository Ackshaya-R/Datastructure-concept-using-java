package Stack;

public class viii_targetfindusingarray
{
    int MAX_SIZE=10;
    int[] arr=new int [MAX_SIZE];
    int top;
    viii_targetfindusingarray()
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

    int check(int target)
    {
        for(int i=0;i<=top;i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    void display() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stcak underflow");
        }
        for (int i = 0; i <= top; i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
    public static void main(String args[])
    {
        viii_targetfindusingarray c=new viii_targetfindusingarray();
        c.push(6);
        c.push(2);
        c.push(1);
        c.push(5);
        c.display();
        System.out.println("The index of the target element is:"+c.check(5));
    }
}
