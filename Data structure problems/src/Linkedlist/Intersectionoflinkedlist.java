package Linkedlist;

public class Intersectionoflinkedlist
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
    Intersectionoflinkedlist()
    {
        head=null;
    }

    public void insertAtBegin(int val)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null  && temp.next!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node getIntersectionNode(Node headA,Node headB)
    {
        Node a=headA;
        Node b=headB;

        while(a!=b)
        {
            a=(a==null)?headB:a.next;
            b=(b==null)?headA:b.next;
        }
        return a;
    }

    public static void main(String args[])
    {
        Intersectionoflinkedlist listA=new Intersectionoflinkedlist();
        Intersectionoflinkedlist listB=new Intersectionoflinkedlist();


        listA.insertAtBegin(1);
        listA.insertAtBegin(4);
        listA.insertAtBegin(7);

        listB.insertAtBegin(6);
        listB.insertAtBegin(4);
        listB.insertAtBegin(0);
        listA.head.next=listB.head.next; //Make a intersection point
        Node intersection=listA.getIntersectionNode(listA.head,listB.head);
        if(intersection!=null)
        {
            System.out.println("The intersection points is:"+intersection.data);
        }
        else {
            System.out.println("No intersection");
        }
    }
}
