package LinkedList;
/*
P2. Add Two Numbers
You are given two non-empty linked lists representing
two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers
and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.val);
        ListNode l3 = head;
        l3.val = (l1.val+l2.val)%10;
        int result = (l1.val+l2.val)/10;

        while (l1.next!=null||l2.next!=null){

            if (l1.next==null){

                    l3.next = new ListNode((result + l2.next.val)%10);
                    result = (result + l2.next.val)/10;
                    l2 = l2.next;

                }
            else if (l2.next==null){

                    l3.next = new ListNode((result + l1.next.val)%10);
                    result = (result + l1.next.val)/10;
                    l1=l1.next;

                }

            else {
                l3.next = new ListNode( (result + l1.next.val + l2.next.val)%10);
                result = (result + l1.next.val + l2.next.val)/10;
                l1=l1.next;
                l2=l2.next;
            }
            l3=l3.next;
        }
        if (result>0){
            l3.next = new ListNode(result);
        }
        return head;

        /*long result1 = 0;
        long result2 = 0;
        int pow=0;
        ListNode head= l1;

        while (l1!=null){
            result1= (int) (result1+ (l1.val)*Math.pow(10,pow));
            pow++;
            l1=l1.next;
        }
        System.out.println(result1);

        pow=0;
        while (l2!=null){
            result2= (int) (result2+ (l2.val)*Math.pow(10,pow));
            pow++;
            l2=l2.next;
        }
        System.out.println(result2);

        result1 = result1+result2;

        System.out.println(result1);

        ListNode result=head;
        result.val = (int) (result1%10);
        System.out.println(result.val);
        while(result1>=10){
            result1=result1/10;
            if (result.next==null){
                result.next = new ListNode((int) (result1%10));
            }else {
                result.next.val = (int) (result1%10);
            }
            result=result.next;
            System.out.println(result.val);
        }
        return head;*/
    }

    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        l1.add(new ListNode(9));
        System.out.print("L1 - ");
        l1.print();

        LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(9));

        System.out.print("L2 - ");
        l2.print();

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode result= addTwoNumbers.addTwoNumbers(l1.head, l2.head);
        System.out.println(result.val);
        while (result.next!=null){
            result=result.next;
            System.out.println(result.val);
        }
    }
}
