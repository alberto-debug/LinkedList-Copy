public class LinkedList {

    Node head;

    public void insert(int x){

        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;

        if (head == null){
            head = newNode;
        }
    }

}
