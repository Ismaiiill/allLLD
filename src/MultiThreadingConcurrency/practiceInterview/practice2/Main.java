package src.MultiThreadingConcurrency.practiceInterview.practice2;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        System.out.println(stack.push(5));
        System.out.println(stack.push(6));


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }


}
