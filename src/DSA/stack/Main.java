package DSA.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");

        stack.pop();

        System.out.println(stack.peek());

        System.out.println(stack.search("Skyrim"));

        System.out.println(stack);

        //stack dsa = LIFO data structure. Last-in First-out
        //            stores objects into a sort of "vertical tower"
        //            push() to add to the top
        //            pop() to remove from the top
    }
}
