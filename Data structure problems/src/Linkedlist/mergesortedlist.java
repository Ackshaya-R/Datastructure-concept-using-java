package Linkedlist;

public class mergesortedlist
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
    mergesortedlist()
    {
        head=null;
    }

    public void insertAtBegin(int val)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public void display(Node node)
    {
        Node temp=node;
        while(temp!=null & temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node mergeSortedlist(Node list1,Node list2)
    {
        Node dummy=new Node(0);
        Node temp=dummy;

        while(list1!=null && list2!=null)
        {
            if(list1.data<=list2.data)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null)
        {
            temp.next=list1;
        }
        else {
            temp.next=list2;
        }
        return dummy.next;
    }

    public static void main(String args[])
    {
        mergesortedlist list1=new mergesortedlist();
        mergesortedlist list2=new mergesortedlist();

        list1.insertAtBegin(9);
        list1.insertAtBegin(4);
        list1.insertAtBegin(1);


        list2.insertAtBegin(5);
        list2.insertAtBegin(3);
        list2.insertAtBegin(2);

        mergesortedlist mergelist=new mergesortedlist();
        Node mergedHead=mergelist.mergeSortedlist(list1.head,list2.head);

        System.out.println("Merged sorted list");
        mergelist.display(mergedHead);

    }
}
