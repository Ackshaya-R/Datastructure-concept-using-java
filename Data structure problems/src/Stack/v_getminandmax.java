package Stack;

public class v_getminandmax
{
    int MAX_SIZE=20;
    int[] arr=new int[MAX_SIZE];
    int top;
    v_getminandmax ()
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
   int get_min()
   {
       if(top==-1)
       {
           throw new IndexOutOfBoundsException("Stack is empty");
       }
       int min=arr[0];
       for(int i=1;i<=top;i++)
       {
           if(arr[i]<min)
           {
               min=arr[i];
           }
       }
       return min;
   }
    int get_max()
    {
        if(top==-1)
        {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int max=arr[0];
        for(int i=1;i<=top;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
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
        v_getminandmax s=new v_getminandmax ();
        s.push(8);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.display();
        int max_val=s.get_max();
        System.out.println("The maximum element in the stack is:"+max_val);

        int min_val=s.get_min();
        System.out.println("The minimum element in the stack is:"+min_val);

    }
}
