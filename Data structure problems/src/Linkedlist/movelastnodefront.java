package Linkedlist;

public class movelastnodefront
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
    movelastnodefront()
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

    public void movetofront()
    {
        if(head==null && head.next==null)
            return;
        Node secondlast=null;
        Node last=head;

        while(last.next!=null)
        {
            secondlast=last;
            last=last.next;
        }

        secondlast.next=null;
        last.next=head;
        head=last;
    }

    public static void main(String args[])
    {
        movelastnodefront list=new movelastnodefront();
        list.insertAtbegin(3);
        list.insertAtbegin(1);
        list.insertAtbegin(4);
        list.insertAtbegin(2);

        list.display();
        list.movetofront();
        list.display();
    }
}
