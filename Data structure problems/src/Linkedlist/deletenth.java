package Linkedlist;

public class deletenth
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
    deletenth()
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

    public int deletenthnodefromlast(int k)
    {
        Node dummy=new Node(0);//the value will be anything like 0,-1,-2,-3....
        dummy.next=head; //important;
        Node slow=dummy;
        Node fast=dummy;

        for(int i=0;i<k;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        int deletedvalue=slow.next.data;
        slow.next=slow.next.next;
        return deletedvalue;
    }

    public static void main(String args[])
    {
        deletenth list=new deletenth();
        list.insertAtbegin(6);
        list.insertAtbegin(3);
        list.insertAtbegin(1);
        list.insertAtbegin(9);
        list.insertAtbegin(5);
        list.display();

        int k=1;
        try
        {
            int result=list.deletenthnodefromlast(k);
            System.out.println(result);
            list.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
