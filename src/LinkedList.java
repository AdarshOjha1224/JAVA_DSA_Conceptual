public class LinkedList<T> {
    // 1. The Node Class
    // It is static because it doesn't need access to the outer class's instance variables.
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node<T> head; // Points to the first node in the list
    private int size;     // Tracks the number of elements
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    // ==========================================
    // INSERTION OPERATIONS
    // ==========================================
    // Add a node at the beginning (O(1) time complexity)
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head; // The new node points to the current head
        head = newNode;      // The head is updated to the new node
        size++;
    }
    // Add a node at the end (O(n) time complexity)
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // Traverse to the last node
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    // Insert a node at a specific index (O(n) time complexity)
    public void insertAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        // Traverse to the node just before the insertion point
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next; // Point new node to the next node
        current.next = newNode;      // Point current node to the new node
        size++;
    }
    // ==========================================
    // DELETION OPERATIONS
    // ==========================================
    // Remove the first node (O(1) time complexity)
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }
        head = head.next; // Move head to the next node
        size--;
    }
    // Remove the last node (O(n) time complexity)
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }
        if (head.next == null) {
            head = null; // Only one element in the list
            size--;
            return;
        }
        Node<T> current = head;
        // Traverse to the second-to-last node
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; // Sever the link to the last node
        size--;
    }
    // Remove a node by its value (O(n) time complexity)
    public void removeByValue(T data) {
        if (head == null) return;
        // If the head holds the value
        if (head.data.equals(data)) {
            removeFirst();
            return;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        // If the value was found, bypass the node
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        } else {
            System.out.println("Value " + data + " not found in the list.");
        }
    }
    // ==========================================
    // UTILITY OPERATIONS
    // ==========================================
    // Display the list (O(n) time complexity)
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // Get the size of the list (O(1) time complexity)
    public int getSize() {
        return size;
    }
    // Search for a value (O(n) time complexity)
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    // ==========================================
    // MAIN METHOD TO DEMONSTRATE
    // ==========================================
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("1. Initial state:");
        list.printList();
        System.out.println("\n2. Adding elements (addLast & addFirst):");
        list.addLast("Banana");
        list.addLast("Cherry");
        list.addFirst("Apple");
        list.printList(); // Apple -> Banana -> Cherry -> null
        System.out.println("\n3. Inserting at index 2:");
        list.insertAt(2, "Blueberry");
        list.printList(); // Apple -> Banana -> Blueberry -> Cherry -> null
        System.out.println("\n4. Current Size: " + list.getSize());
        System.out.println("\n5. Removing the first and last elements:");
        list.removeFirst();
        list.removeLast();
        list.printList(); // Banana -> Blueberry -> null
        System.out.println("\n6. Removing by value ('Banana'):");
        list.removeByValue("Banana");
        list.printList(); // Blueberry -> null
        System.out.println("\n7. Checking if 'Blueberry' exists: " + list.contains("Blueberry"));
        System.out.println("8. Checking if 'Apple' exists: " + list.contains("Apple"));
    }
}