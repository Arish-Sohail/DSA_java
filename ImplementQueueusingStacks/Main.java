package ImplementQueueusingStacks;

public class Main {
    public static void main(String[] args) {
        MyQueue s =new MyQueue();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());

    }
}
