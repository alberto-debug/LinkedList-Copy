public class LinkedList {

    Node head;

    public void insert(int x){

        Node newnode = new Node();
        newnode.data  = x;
        newnode.next = null;

        if (head == null){
            head = newnode;
        } else {
            Node n = head;
            while (n.next != null){
                n=n.next;
            }
            n.next = newnode;
        }
    }

    public void traverse(){
        Node v = head;

        while (v.next != null){
            System.out.println(v.data);
            v = v.next;
        }
        System.out.println("Tail node : " + v.data);
    }

}


