package Linkedlist;

public class Reverselinkedlist
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
    Reverselinkedlist()
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

    public void reverse()
    {
        Node prev=null;
        Node current=head;
        Node next=head.next;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        head=prev;
    }

    public static void main(String args[])
    {
        Reverselinkedlist list=new Reverselinkedlist();
        list.insertAtbegin(2);
        list.insertAtbegin(1);
        list.insertAtbegin(8);
        list.insertAtbegin(5);

        System.out.println("The original list:");
        list.display();
        list.reverse();
        System.out.println("The reverse list:");
        list.display();
    }
}
