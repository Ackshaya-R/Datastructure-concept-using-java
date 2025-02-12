public class demo
{
    public static void main(String args[]) {
        linkedlistoperations list = new linkedlistoperations();
        list.insertAtbegin(5);
        list.insertAtbegin(2);
        list.insertAtbegin(0);
        list.insertAtbegin(1);
        list.insertAtpos(2, 7);
        list.display();

        list.delAtpos(1);
        list.display();
        list.getindex(1);
        list.update(1, 9);
        list.display();
        list.delAtend();
        list.display();
        list.insertAtend(3);
        list.display();
        System.out.println(list.search(2));
        System.out.println(list.contains(9));
        System.out.println(list.contains(8));
        list.reverse();
        list.display();
        System.out.println(list.hascycle());
        list.createCycle();
        System.out.println(list.hascycle());


    }
}
