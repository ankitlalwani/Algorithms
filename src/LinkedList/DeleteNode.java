package LinkedList;

/*
237. Delete Node in a Linked List
Write a function to delete a node in a singly-linked list.
You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
It is guaranteed that the node to be deleted is not a tail node in the list.
 */

public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next=node.next.next;
    }

    public static void main(String[] args){

        LLFunctions l1 = new LLFunctions();
        l1.add(new ListNode(4));
        l1.add(new ListNode(5));
        l1.add(new ListNode(1));
        l1.add(new ListNode(9));
        System.out.print("L1 - ");
        l1.print();

        LLFunctions l2 = new LLFunctions();
        l2.add(new ListNode(1));

        ListNode temp = l1.head;

        while (temp.next.val!=5){
            temp = temp.next;
        }
        DeleteNode deleteNode = new DeleteNode();


        deleteNode.deleteNode(temp.next);
        System.out.println("Result: ");
        l1.print();

    }
}
