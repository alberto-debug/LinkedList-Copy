public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.printf("List of of insertion : \n");
        list.traverse();
    }
}

