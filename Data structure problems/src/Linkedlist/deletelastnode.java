package Linkedlist;

public class deletelastnode
{
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    Node head;
    deletelastnode()
    {
        head=null;
    }

    public void insertAtbegin(int val)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void deletelast()
    {
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public static void main(String args[])
    {
        deletelastnode list=new deletelastnode();
        list.insertAtbegin(1);
        list.insertAtbegin(3);
        list.insertAtbegin(9);
        list.insertAtbegin(2);

        System.out.println("Before deleting the last node:");
        list.display();
        list.deletelast();
        System.out.println("After deleting the last node:");
        list.display();
    }
}
