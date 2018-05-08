package algo.list;

import datastruct.list.sll.SNode;

/**
 * LeetCode 82
 *
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * i.e.
 * input: 1->2->3->3->4->4->5
 * output: 1->2->5
 */
public class DeleteDuplicates {

    public static SNode delete(SNode head) {
        //TODO
        return null;
    }

    public static void main(String[] args) {
        SNode<Integer> node1 = new SNode<Integer>(1);
        SNode<Integer> node2 = new SNode<Integer>(2);
        SNode<Integer> node3 = new SNode<Integer>(3);
        SNode<Integer> node4 = new SNode<Integer>(3);
        SNode<Integer> node5 = new SNode<Integer>(4);
        SNode<Integer> node6 = new SNode<Integer>(4);
        SNode<Integer> node7 = new SNode<Integer>(5);
        SNode<Integer> head = node1;
        display(head);
        //delete duplicate elements
        SNode newHead = delete(head);
        display(newHead);


    }

    public static String display(SNode head) {
        if (head == null) return "";
        StringBuilder sb = new StringBuilder();
        SNode temp = head;
        while (temp.next != null) {
            sb.append(temp.data).append("->");
            temp = temp.next;
        }
        sb.append(temp.data);
        return sb.toString();
    }

}
