package Q2_Linked_Lists.Q2_2_ReturnKthToLast;
import Q2_Linked_Lists.myNode;
import Q2_Linked_Lists.myLinkedList;

public class Solution {

    public static myNode returnKthToLast(myNode head, int k) {

        myNode p1 = head;
        myNode p2 = head;

        for (int i = 0; i < k; i++) {
            if (p2 != null) p2 = p2.next;
            else return null; // Out of bounds
        }

        while(p2.next != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        myLinkedList list = new myLinkedList(a);
        int k = 6;
        myNode ret = returnKthToLast(list.head, k);

        if(ret != null) System.out.println("The " + k + "th element to the last element is " + ret.data);
        else System.out.println("The " + k + "th element to the last element is not found");
    }
}

// Time: O(n)
// Space: O(1)
