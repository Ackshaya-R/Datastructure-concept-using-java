package Linkedlist;

public class Linkedlistcycle1 //To check a cycle exits or not
{
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }

    Node head;

    Linkedlistcycle1()
    {
        head = null;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public boolean detectcycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==slow)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        Linkedlistcycle1 list=new Linkedlistcycle1();
        list.insertAtBegin(3);
        list.insertAtBegin(1);
        list.insertAtBegin(9);

        System.out.println(list.detectcycle(list.head));

    }
}