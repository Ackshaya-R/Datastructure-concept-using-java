package Linkedlist;

public class Linkedlistcycle2 //To check a cycle exits or not
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
    }

    Node head;

    Linkedlistcycle2()
    {
        head = null;
    }
    public void insertAtBegin(int data) {
        Node newNode=new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node detectcycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String args[])
    {
        Linkedlistcycle2 list=new Linkedlistcycle2();
        list. insertAtBegin(3);
        list.insertAtBegin(2);
        list.insertAtBegin(1);

        // Manually create a cycle for testing (1 -> 2 -> 3 -> 2)
        list.head.next.next.next = list.head.next;

        Node cycleStart = list.detectcycle(list.head);

        if (cycleStart != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
