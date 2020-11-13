package LinkedList;
/*
876. Middle of the Linked List
Given a non-empty, singly linked list with head node head,
return a middle node of linked list.
If there are two middle nodes, return the second middle node.
 */
public class MiddleNode {

    public ListNode middleNode(ListNode head) {

        int count=1;
        ListNode l1 = head;

        while(l1.next!=null){
            count++;
            l1=l1.next;
        }
        count = ((count/2)+1);
        l1 = head;
        int stop=1;
        while(stop<count){
            l1=l1.next;
            stop++;
        }
        return l1;
    }

    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(2));
        l1.add(new ListNode(3));
        l1.add(new ListNode(4));
        l1.add(new ListNode(5));

        System.out.print("L1 - ");
        l1.print();

        LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(1));

        MiddleNode middleNode = new MiddleNode();
       ListNode result =  middleNode.middleNode(l1.head);

        System.out.println("Result: " + result.val);
    }
}
