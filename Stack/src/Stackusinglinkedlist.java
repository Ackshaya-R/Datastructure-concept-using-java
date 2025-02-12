//T is used here to get any type of data like integer,string,char etc.... to store in a stack

public class Stackusinglinkedlist<T>
{
    class Node
    {
        T data;
        Node next;
        Node(T val) //This constructor is used for that new node is going to create means initially it has one data and one null pointer..
        {
            data=val;
            next=null;
        }
    }
    Node top;
    Stackusinglinkedlist() //It is for initialisation that the stack is now empty
    {
        top=null;
    }

    void push(T val)
    {
        Node newnode=new Node(val);
        newnode.next=top;
        top=newnode;
    }

    T pop()
    {
        if(top==null)
            throw new IndexOutOfBoundsException("Stack is empty");

        T tmp=top.data;
        top=top.next;
        return tmp;
    }

    boolean isEmpty()
    {
        return top==null;
    }

    T peek()
    {
        return top.data;
    }

    public static void main(String args[])
    {
        Stackusinglinkedlist<Integer> s=new Stackusinglinkedlist<>();
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
