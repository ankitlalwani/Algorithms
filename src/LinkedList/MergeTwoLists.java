package LinkedList;

/*
P21 - Merge two sorted linked lists and return it as a new sorted list.
The new list should be made by splicing together the nodes of the first two lists.
 */

import java.util.LinkedList;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p=head;

        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p=p.next;
        }

        if(p1!=null){
            p.next = p1;
        }

        if(p2!=null){
            p.next = p2;
        }

        return head.next;
    }

    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(4);

        LinkedList l2 = new LinkedList();
        l2.add(1);
        l2.add(3);
        l2.add(4);


    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
