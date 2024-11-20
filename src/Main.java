public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList list = new LinkedList();
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        System.out.println("List of all elementsL \n");

        list.traverse();
    }
}

