package LinkedList;

public class getDecimalValue {

    public int getDecimalVal(ListNode head){

        String val = Integer.toString(head.val);
        ListNode l1 = head;
        while(l1.next!=null){
            l1=l1.next;
            val = val+Integer.toString(l1.val);
        }
        int result = Integer.parseInt(val,2);

        return result;
    }


    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(0));
        l1.add(new ListNode(1));
        /*l1.add(new ListNode(4));
        l1.add(new ListNode(5));*/

        System.out.print("L1 - ");
        l1.print();

        /*LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(1));*/

        getDecimalValue getDecimalValue = new getDecimalValue();
        int result =  getDecimalValue.getDecimalVal(l1.head);

        System.out.println("Result: " + result);
    }
}
