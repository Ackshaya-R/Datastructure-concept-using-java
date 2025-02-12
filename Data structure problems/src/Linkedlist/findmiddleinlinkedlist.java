package Linkedlist;

public class findmiddleinlinkedlist
{
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }
        Node head;
        findmiddleinlinkedlist()
        {
            head=null;
        }

        public void insertAtBegin(int val)
        {
            Node newNode=new Node(val);
            newNode.next=head;
            head=newNode;
        }

        public Node findmiddle(Node head)
        {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        public static void main(String args[])
        {
            findmiddleinlinkedlist list=new findmiddleinlinkedlist();
            list.insertAtBegin(1);
            list.insertAtBegin(5);
            list.insertAtBegin(3);
            list.insertAtBegin(2);
            list.insertAtBegin(7);

            System.out.println("Middle node: " + list.findmiddle(list.head));
        }
}
