package Q2_Linked_Lists.Node;

public class Node {
    public Node next = null;
    public int data; 

    public Node(int d) {
        data =  d;
    }

    public appendToTail(int d) {
        Node end = new Node(d);
        Node node = this;
        while(node.next != null) {
           node = node.next; 
        }
        node.next = end;
    }

    public static Node deleteNode(Node head, int d) {
        Node n = head;

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