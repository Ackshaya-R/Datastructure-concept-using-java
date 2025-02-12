package Linkedlist;

public class deleteheadnode
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
    deleteheadnode()
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

    public void deletehead()
    {
        if(head!=null)
        {
            head=head.next;
        }
        else {
            System.out.println("The list is already empty");
        }
    }

    public static void main(String args[])
    {
        deleteheadnode list=new deleteheadnode();
        list.insertAtbegin(3);
        list.insertAtbegin(2);
        list.insertAtbegin(5);
        list.insertAtbegin(1);

        System.out.println("Before deleting the head Node:");
        list.display();
        list.deletehead();
        System.out.println("After deleting the head Node:");
        list.display();
    }
}
