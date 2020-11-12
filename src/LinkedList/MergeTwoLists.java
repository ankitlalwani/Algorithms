package LinkedList;

/*
P21 - Merge two sorted linked lists and return it as a new sorted list.
The new list should be made by splicing together the nodes of the first two lists.
 */

import org.w3c.dom.*;

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

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(2));
        l1.add(new ListNode(5));
        System.out.print("L1 - ");
        l1.print();

        LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(1));
        l2.add(new ListNode(3));
        l2.add(new ListNode(4));
        System.out.print("L2 - ");
        l2.print();

        MergeTwoLists m2 = new MergeTwoLists();
       l1.head =  m2.mergeTwoLists(l1.head,l2.head);
        System.out.print("L3 - ");
       l1.print();
    }
}
 class ListNode{
      int val;
      ListNode next;
      ListNode(int x) {
          val = x; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 class LLFunctions{
    ListNode head;

     public void add(ListNode data){

         if(head==null) {
             head = data;
         }else {
             ListNode current = head;

             if (current != null) {
                 while (current.next != null) {
                     current = current.next;
                 }
                 current.next = data;
             }
         }

     }

     public void print(){
         ListNode temp = head;
         System.out.print(" Print List: ");
         while (temp!=null){
             System.out.print(" "+ temp.val);
             temp = temp.next;
         }
         System.out.println();
     }
 }
