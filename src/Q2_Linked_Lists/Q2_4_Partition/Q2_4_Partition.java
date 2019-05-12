package Q2_Linked_Lists.Q2_4_Partition;
import Q2_Linked_Lists.myLinkedList;
import Q2_Linked_Lists.myNode;

public class Q2_4_Partition {
    public static myNode partition(myNode node, int partition) {
        myNode beforeStart = null;
        myNode beforeEnd = null;
        myNode afterStart = null;
        myNode afterEnd = null;

        while (node != null) {
            myNode next = node.next;
            node.next = null;
            if (node.data < partition) {
                if(beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if(afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }
        if (beforeStart == null) return afterStart;
        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public static myNode partition2(myNode node, int partition) {
        myNode head = node;
        myNode tail = node;

        while (node != null) {
            myNode next = node.next;
            if (node.data < partition) {
                node.next = head;
                head = node;
            } else
            {
                tail.next = node;
                tail = node;
                tail.next = null;
            }
            node = next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 8, 5, 10, 2, 1 };
        myLinkedList list1 = new myLinkedList(a);
        myLinkedList list2 = new myLinkedList(a);
        System.out.println(list1.toString());

        myNode ret1 = partition(list1.head, 5);
        myNode ret2 = partition2(list2.head, 5);

        System.out.print("Solution 1: ");
        while(ret1 != null) {
            System.out.print(ret1.data + " ");
            ret1 = ret1.next;
        }

        System.out.println();

        System.out.print("Solution 2: ");
        while(ret2 != null) {
            System.out.print(ret2.data + " ");
            ret2 = ret2.next;
        }
        System.out.println();
    }
}
