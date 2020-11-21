package LinkedList;

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode next = null;
        ListNode current = head;
        ListNode prev = null;
        ListNode result = null;

        int count=1;

        while(current!=null){

            if (count>=m && count<=n) {

                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }else {

            }
        }
        head = prev;
        return head;
    }

    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(2));
        l1.add(new ListNode(3));
        l1.add(new ListNode(4));
        l1.add(new ListNode(5));
        l1.add(new ListNode(6));
        l1.add(new ListNode(7));
        System.out.print("L1 - ");
        l1.print();

        ReverseBetween reverseBetween = new ReverseBetween();

        ListNode result = reverseBetween.reverseBetween(l1.head,2,4);

        while (result!=null){
            System.out.print(result.val + " ");
            result=result.next;
        }




    }
}
