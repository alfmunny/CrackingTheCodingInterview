package Q2_Linked_Lists;
import Q2_Linked_Lists.myNode;

public class myLinkedList {
    public myNode head = null;
    public int length;

    public myLinkedList(int[] intArray) {
        length = intArray.length;
        myNode previous = head;
        for (int i = 0; i < intArray.length; i++) {
            myNode newNode = new myNode(intArray[i]);
            if (i == 0) {
                head = newNode;
            }
            else previous.next = newNode;
            previous = newNode;
        }
    }
    public String toString() {
        myNode p = head;
        StringBuilder res = new StringBuilder();

        while(p != null)
        {
            res.append(p.data);
            p = p.next;
        }

        return res.toString();
    }

}
