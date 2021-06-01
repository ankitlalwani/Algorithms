package LinkedList;

public class SwapPairs {


    public ListNode swapAdjPairs(ListNode L1){




        return L1;
    }

    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(1));
        l1.add(new ListNode(0));
        l1.add(new ListNode(1));
        l1.add(new ListNode(4));
        l1.add(new ListNode(5));
        l1.add(new ListNode(6));

        System.out.print("L1 - ");
        l1.print();

        /*LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(1));*/

        SwapPairs swapPairs = new SwapPairs();
        ListNode result = swapPairs.swapAdjPairs(l1.head);

        while (result!=null){
            System.out.print(result.val+ " ");
            result=result.next;
        }

/*        getDecimalValue getDecimalValue = new getDecimalValue();
        int result =  getDecimalValue.getDecimalVal(l1.head);

        System.out.println("Result: " + result);*/
    }

}
