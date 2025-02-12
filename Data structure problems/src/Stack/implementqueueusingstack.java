package Stack;
import java.util.Stack;
class implementqueueusingstack
{
    public Stack<Integer> first;
    public Stack<Integer> second;

    public implementqueueusingstack()
    {
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item)
    {
        first.push(item);
    }

    public int remove()
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peeked=second.pop();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peeked;
    }

    public int peek()
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peeked=second.pop();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty()
    {
        return first.isEmpty();
    }
    public static class Main
    {
        public static void main(String args[])
        {
            implementqueueusingstack s=new implementqueueusingstack();
            s.add(2);
            s.add(8);
            s.add(3);
            s.add(9);
            System.out.println(s.remove());
            System.out.println(s.peek());
            System.out.println(s.isEmpty());
        }
    }
}
