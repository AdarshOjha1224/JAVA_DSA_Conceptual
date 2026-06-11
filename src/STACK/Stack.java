package STACK;

public class Stack {

    private int[] arr = new int[5];
    int top , size ;

    public Stack(){
        size = arr.length;
        top = -1 ;
    }

    public void push(int data) {
//        top++;
        if(top<size) arr[++top] = data;
        else System.out.println("Stack Overflow !!");
    }

    public int pop() {
        if(top>-1) return arr[top--];
        else System.out.println("Stack Underflow !! ");
        return 0 ;
    }

    public int peek() {
        return arr[top];
    }
    public void printStack() {
        for (int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

}
