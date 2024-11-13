public class LinkedList {

    Node head;

    public void insert(int x){
        Node newnode = new Node();
        newnode.data = x;
        newnode.next = null;

        if (head == null){
            newnode = head;
        } else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }

            n.next = newnode;

        }
    }

}
