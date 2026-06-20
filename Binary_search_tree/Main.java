package Binary_search_tree;

public class Main {
    public static void main(String[] args) {
        BST t = new BST();

        t.insert(new Node(7));
        t.insert(new Node(4));
        t.insert(new Node(2));
        t.insert(new Node(6));
        t.insert(new Node(8));
        t.insert(new Node(9));
        t.insert(new Node(1));
        t.insert(new Node(3));
        t.insert(new Node(5));

        t.display();

        System.out.println(t.search(2));

        t.remove(2);
        t.display();
    }
}
