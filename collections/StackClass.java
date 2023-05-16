package java_exercises_github.collections;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // add elements over LIFO stack principle
        stack.push("Ana");
        stack.push("Dana");
        stack.push("Maria");
        stack.push("Ioana");
        stack.push("Diana");

        System.out.println(stack);

        // remove elements over LIFO stack principle
        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
