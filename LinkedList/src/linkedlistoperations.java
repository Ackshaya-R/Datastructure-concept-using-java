public class linkedlistoperations
{
    class Node{
        int data;
        Node next;

        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    Node head;
    linkedlistoperations()
    {
        head=null;
    }

    public void insertAtbegin(int val)   //Insert a value at beginning
    {
        Node newNode=new Node(val);
        if(head==null) //when list is empty
        {
            head=newNode;
        }
        else {  //when list is not empty
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtend(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else {
            Node temp=head;
            while(temp.next!=null) //temp.next is important
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void display()
    {
        Node temp=head;//start from head and it stors ina temp reference varaible;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void insertAtpos(int pos,int val)
    {
        if(pos==0)   //if user enters the 0th index
        {
            insertAtbegin(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;

            if(temp==null)     //If the pos is outofbound the size
            {
                System.out.print("Invalid position");
                return;
            }
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void delAtbegin()
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        head=head.next;
    }
    public void delAtend()
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void delAtpos(int pos)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        if(pos==0)
        {
            delAtbegin();
            return;
        }

        Node temp=head;
        Node prev=null;

        for(int i=1;i<=pos;i++)// jump till node to be deleted
        {
            prev=temp; //keep track of prev node then only we can able to leave the del node connect to the next node
            temp=temp.next; //jump to the next node
        }

        prev.next=temp.next; //leave the del pos and connect to next node
    }

    public void getindex(int pos)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            if(temp==null)
            {
                throw new IndexOutOfBoundsException("Invalid pos");
            }
            temp=temp.next;
        }
        if(temp!=null)
        {
            System.out.println("Element at index "+pos+" is: "+temp.data);
        }
    }

    public void update(int pos,int val)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            if(temp==null)
            {
                throw new IndexOutOfBoundsException("Invalid pos");
            }
            temp=temp.next;
        }
        if(temp!=null)
        {
            temp.data=val;
        }
    }

    public int search(int val)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        Node temp=head;
        int index=0;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return index;
            }
            temp=temp.next;
            index++;
        }

        return -1;
    }
    public boolean contains(int val)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("Delete attempted on empty list");
        }
        Node temp=head;
        int index=0;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return true;
            }
            temp=temp.next;
            index++;
        }

        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while(current!=null)
        {
            next=current.next;
            current.next=prev; //reverse link important
            prev=current;
            current=next;
        }

        head=prev;
    }
    public void  createCycle()
    {
        if(head==null)
            return;

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head.next;
    }

    public boolean hascycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;


            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }


}
