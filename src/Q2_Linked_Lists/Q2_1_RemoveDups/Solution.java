package Q2_Linked_Lists.Q2_1_RemoveDups;

import Q2_Linked_Lists.myNode;
import Q2_Linked_Lists.myLinkedList;

import java.util.HashSet;

public class Solution{

    public static void deleteDups(myNode node) {
        HashSet<Integer> set = new HashSet<>();

        myNode previous = null;

        while (node!= null) {
            if (set.contains(node.data)) {
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }

            node = node.next;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 5, 6, 2, 3, 4, 5,  6, 7, 8 };
        myLinkedList list = new myLinkedList(a);
        System.out.println(list.toString());
        deleteDups(list.head);
        System.out.println(list.toString());
    }
}

