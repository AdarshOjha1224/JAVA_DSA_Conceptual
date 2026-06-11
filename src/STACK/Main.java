package STACK;

public class Main {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(50);
        nums.push(60);
        System.out.println(nums.peek());
        nums.push(100);
        nums.printStack();
    }
}
