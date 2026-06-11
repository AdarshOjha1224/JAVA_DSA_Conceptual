package Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.addFirst(5);
        nums.printValues();
        nums.delete(20);
        nums.printValues();


    }
}
