package LinkedList;

public class DLL
{

    private Node head=null;
    private Node tail=null;
    private Node temp=null;
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int val)
    {
        Node node =new Node(val);
        Node last=head;
        node.next=null;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while (last.next!=null)
        {
            last=last.next;
        }
        last.next=node;
        last.prev=last;
    }

    public void display()
    {
        temp=head;
        Node last=null;

        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("Print reverse");
        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("START");
    }
    public void deleteFirst()
    {
        Node node=head;
        head=head.next;

        if(node==null)
        {
            node=node.next;
            node.next=head;
            node.prev=null;
        }

        node=head;
    }
    public void deleteLast()
    {

        Node node=head;

        if(node==null)
        {
            node=node.prev;
            node.prev=head;
            node.next=null;
        }

        node=head;
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
