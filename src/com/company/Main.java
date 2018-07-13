package com.company;

public class Main {

    public static void main(String[] args) {
//        Queue QUEUE1;
//        QUEUE1 = new Queue();
//        QUEUE1.push(23);
//        QUEUE1.push(11);
//        QUEUE1.push(2);
//        QUEUE1.display();
//        QUEUE1.pop();
//        QUEUE1.display();
//        QUEUE1.pop();
//        QUEUE1.display();
//        QUEUE1.pop();
//        QUEUE1.display();

        Stack STACK1;
        STACK1 = new Stack();
        STACK1.push(23);
        STACK1.push(11);
        STACK1.push(2);
        STACK1.PrintElements();
        STACK1.pop();
        STACK1.PrintElements();
        STACK1.pop();
        STACK1.PrintElements();

        STACK1.pop();
        STACK1.PrintElements();

    }
}
