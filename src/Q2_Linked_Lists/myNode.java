package Q2_Linked_Lists;

public class myNode {
    public myNode next = null;
    public int data; 

    public myNode(int d) {
        data =  d;
    }

    public void appendToTail(int d) {
        myNode end = new myNode(d);
        myNode myNode = this;
        while(myNode.next != null) {
           myNode = myNode.next;
        }
        myNode.next = end;
    }

    public static myNode deleteNode(myNode head, int d) {
        myNode n = head;

        if (n == null) return head;

        if (n.data == d){
            return head.next;
        }

        while (n.next != null)
        {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;

    }
}
