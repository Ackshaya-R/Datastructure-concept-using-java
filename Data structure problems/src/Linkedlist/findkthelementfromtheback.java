package Linkedlist;

public class findkthelementfromtheback
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
    findkthelementfromtheback()
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
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int findkth(int k)
    {
        Node first=head,second=head;
        for(int i=0;i<k;i++)
        {
            if(first==null)
            {
                System.out.println("K is greater than the linked list size");
            }
            first=first.next;
        }
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }
        return second.data;
    }

    public static void main(String args[])
    {
        findkthelementfromtheback list=new findkthelementfromtheback();
        list.insertAtBegin(7);
        list.insertAtBegin(4);
        list.insertAtBegin(5);
        list.insertAtBegin(3);
        list.insertAtBegin(2);

        System.out.println("Linked list datas:");
        list.display();

        int k=4;
        try{
            int result=list.findkth(k);
            System.out.println("The "+k+"rd element from the end is: "+result);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
