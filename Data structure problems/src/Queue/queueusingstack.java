package Queue;
import java.util.Stack;
public class queueusingstack
{
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    void enqueue(int val)
    {
        stack1.push(val);
    }

    int dequeue()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    boolean isEmpty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String args[])
    {
        queueusingstack q=new queueusingstack();
        q.enqueue(4);
        q.enqueue(9);
        q.enqueue(2);
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
    }
}
