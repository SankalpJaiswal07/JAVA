package LinkedList;

import Array.medium.Sort_012;

public class Main
{
    public static void main(String[] args) {
       /* LL list=new LL();
        list.insertfirst(7);
        list.insertfirst(6);
        list.insertfirst(5);
        list.insertfirst(4);
        list.display();
        list.insertLast(8);
        list.display();
        list.insert(2,0);
        list.insert(3,1);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
        System.out.println(list.find(7));*/

        DLL list=new DLL();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.display();
        list.deleteLast();
        list.display();

       /* list.deleteFirst();
        list.display();*/
    }
}
