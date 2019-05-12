package Q2_Linked_Lists.Q2_3_DeleteMiddleNode;

import Q2_Linked_Lists.myLinkedList;
import Q2_Linked_Lists.myNode;

public class Solution {
    public static void deleteMiddleNode(myNode deleteNode) {
       myNode p = deleteNode;
       if (p != null && p.next != null) {
           p.data = p.next.data;
           p.next = p.next.next;
       }
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6 };
        myLinkedList list = new myLinkedList(a);
        System.out.println(list.toString());

        // works
        myNode node = list.head;
        node = node.next.next;

        deleteMiddleNode(node);
        System.out.println(list.toString());

        // Does not work for the last element
        node = node.next.next;

        deleteMiddleNode(node);
        System.out.println(list.toString());
    }

}
