package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlist1
{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        Queue<Integer> q=new LinkedList<>();

        l1.addFirst(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.addLast(9);
        l1.indexOf(5);
        System.out.println(l1);

    }
}
