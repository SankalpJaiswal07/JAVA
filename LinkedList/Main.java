package LinkedList;

public class Main
{
    public static void main(String[] args)
    {/*
        SingleLL ll=new SingleLL();
        ll.insertfirst(6);
        ll.insertfirst(12);
        ll.insertfirst(7);
        ll.insertfirst(20);
        ll.inserlast(3);
        ll.insert(50,3);
        ll.display();

        System.out.println(ll.deleteFirst());

        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.delete(2));
        ll.display();
       */

/*        DoublyLL dll=new DoublyLL();
       dll.insertFirst(6);
        dll.insertFirst(12);
        dll.insertFirst(7);
        dll.insertFirst(25);

        dll.insertLast(99);

        dll.insert(99,65);

        dll.display();*/

        CircularLL cll=new CircularLL();
        cll.insert(23);
        cll.insert(35);
        cll.insert(45);
        cll.insert(55);
        cll.display();
        cll.delete(45);

        cll.display();
    }
}
