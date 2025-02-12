package Linkedlist;

public class deletenodewithoutusingheadpointer
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
    deletenodewithoutusingheadpointer ()
    {
        head=null;
    }

    public void insertAtBegin(int val)
    {
        Node newNode =new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public void deletenode(Node node)
    {
        if(node==null || node.next==null)
        {
            System.out.println("Cannot delete the last node using this method");
            return;
        }
        node.data=node.next.data;
        node.next=node.next.next;
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

    public static void main(String args[])
    {
        deletenodewithoutusingheadpointer list = new deletenodewithoutusingheadpointer();
        list.insertAtBegin(1);
        list.insertAtBegin(4);
        list.insertAtBegin(2);
        list.insertAtBegin(8);
        list.display();

        Node nodetodelete=list.head.next.next;
        list.deletenode(nodetodelete);

        System.out.println("After deleting the node:");
        list.display();

    }
}
