package Linkedlist;

public class removeduplicatesfromasortedlinkedlist {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head;

    removeduplicatesfromasortedlinkedlist() {
        head = null;
    }
    public void insertAtBegin(int val)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public Node removeduplicates(Node head)
    {
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else {
                temp=temp.next;
            }
        }
        return head;
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
        removeduplicatesfromasortedlinkedlist list=new removeduplicatesfromasortedlinkedlist();
        list.insertAtBegin(1);
        list.insertAtBegin(5);
        list.insertAtBegin(3);
        list.insertAtBegin(3);
        list.insertAtBegin(2);

        list.removeduplicates(list.head);
        list.display();
    }
}
