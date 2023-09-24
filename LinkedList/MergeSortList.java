package LinkedList;

public class MergeSortList
{
    public static void main(String[] args) {
        MergeSortList ll=new MergeSortList();
        ll.insertfirst(1);
        ll.insertfirst(2);
        ll.insertfirst(3);
        ll.insertfirst(4);
        ll.insertfirst(5);

        ll.display();
        ll.sortList(ll.head);
        ll.display();
    }
    ListNode head;
    public void insertfirst(int val)
    {
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;
    }
    public void display()
    {
        ListNode temp=head;
        while (temp!=null)
        {
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static ListNode sortList(ListNode head)
    {
          if(head==null && head.next==null)
          {
              return head;
          }
          ListNode mid=getMid(head);
          ListNode left= head;
          ListNode right=mid;
          mid.next=null;

          left=sortList(left);
          right=sortList(right);

          return merge(left,right);
    }

    public static ListNode merge(ListNode first, ListNode second)
    {
        ListNode node=new ListNode();
        ListNode temp=node;
        while (first!=null  && second!=null)
        {
            if(first.val< second.val)
            {
                temp.next=first;
                temp=temp.next;
                first=first.next;
            }
            else
            {
                temp.next=second;
                temp=temp.next;
                second=second.next;
            }
        }
        temp.next=(first!=null)? first:second;
        return node.next;
    }

    public static ListNode getMid(ListNode node)
    {
        ListNode midPrev = null;
        while (node != null && node.next != null) {
            midPrev = (midPrev == null) ? node : midPrev.next;
            node = node.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
     private static class ListNode
    {
        int val;
        ListNode next;
        ListNode()
        {}
        ListNode(int val)
        {
            this.val = val;
        }
    }
    }

