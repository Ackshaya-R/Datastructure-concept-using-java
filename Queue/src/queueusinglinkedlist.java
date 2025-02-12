public class queueusinglinkedlist
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
     Node front,rear;
     queueusinglinkedlist()
     {
          front=null;
          rear=null;
     }

     void enqueue(int val)
     {
          Node newNode=new Node(val);
          if(front==null)
               front=rear=newNode;
          else {
               rear.next = newNode;
               rear = newNode;
          }
     }

     int dequeue()
     {
          if(front==null) //no node in Queue
          {
               throw new IndexOutOfBoundsException("Queue is empty");
          }
          int temp=front.data;
          front=front.next;
          if(front==null)  //deleted last node and now Queue is empty
               rear=null;
          return temp;
     }

     public static void main(String args[])
     {
          queueusinglinkedlist q=new queueusinglinkedlist();
          q.enqueue(6);
          q.enqueue(8);
          q.enqueue(5);

          System.out.println(q.dequeue());
          System.out.println(q.dequeue());
          System.out.println(q.dequeue());
          
     }
}
