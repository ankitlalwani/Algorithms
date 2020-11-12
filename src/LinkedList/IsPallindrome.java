package LinkedList;

/*
P234. Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
 */

public class IsPallindrome {

    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }

        while (head.next!=null) {
            ListNode temp1 = head;
            while (temp1.next.next != null) {
                temp1 = temp1.next;
            }
            if (head.val== temp1.next.val){
                head = head.next;
                temp1.next=null;
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(2));
        l1.add(new ListNode(3));
        l1.add(new ListNode(4));
        l1.add(new ListNode(4));
        l1.add(new ListNode(2));
        l1.add(new ListNode(1));
        System.out.print("L1 - ");
        l1.print();

        LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(1));
        IsPallindrome isPallindrome = new IsPallindrome();
        boolean result = isPallindrome.isPalindrome(l1.head);
        System.out.println(result);

    }
}
