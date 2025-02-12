package Linkedlist;

public class lengthofthelinkedlist
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
    lengthofthelinkedlist()
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
        int count=0;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            count++;
        }
        System.out.println();
        System.out.println("The length of the linkedlist is:"+count);
    }

    public static void main(String args[])
    {
        lengthofthelinkedlist list=new lengthofthelinkedlist();
        list.insertAtbegin(8);
        list.insertAtbegin(5);
        list.insertAtbegin(2);
        list.insertAtbegin(1);
        list.insertAtbegin(4);

        list.display();
    }
}
