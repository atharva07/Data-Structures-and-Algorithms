package DataStructure.LinkedList.DoublyLinkedList;

public class DoublyLinkedListDataStructure {
    
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public static DoublyLinkedListDataStructure insert(DoublyLinkedListDataStructure list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
            new_node.prev = last;
        }

        return list;
    }

    // Method to delete a node by key
    public static DoublyLinkedListDataStructure delete(DoublyLinkedListDataStructure list, int key) {
        Node currNode = list.head;

        // case 1 : if the key is found at head node
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            if (list.head != null) {
                list.head.prev = null;
            }
            System.out.println(key + " found and deleted");
            return list;
        }

        // case 2 : If the key is in the middle or last node
        while (currNode != null && currNode.data != key) {
            currNode = currNode.next;
        }

        // If the key was found, it will be in currNode
        if (currNode != null) {
           if (currNode.prev != null) {
            currNode.prev.next = currNode.next;
           }
           if (currNode.next != null) {
            currNode.next.prev = currNode.prev;
           }
           System.out.println(key + " found and deleted");
        }

        // case 3: If the key is not found
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

    // method to find the length of linked list
    public static int findLength(DoublyLinkedListDataStructure list) {
        int length = 0;
        Node currNode = list.head;

        while (currNode != null) {
            length++;
            currNode = currNode.next;
        }

        return length;
    }

    // method to search an element in linked list
    public static boolean search(DoublyLinkedListDataStructure list, int key) {
        Node currNode = list.head;

        while (currNode != null) {
            if (currNode.data == key) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // Method to print the linked list in forward direction
    public static void printListForward(DoublyLinkedListDataStructure list) {
        Node currNode = list.head;
        System.out.println("Linked List (Forward):");

        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Method to print the linked list in backward direction
    public static void printListBackward(DoublyLinkedListDataStructure list) {
        Node currNode = list.head;

        // Traverse to the last node
        while (currNode != null && currNode.next != null) {
            currNode = currNode.next;
        }

        System.out.println("Linked List (Backward):");
        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedListDataStructure list = new DoublyLinkedListDataStructure();

        // Insert nodes
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Search for elements
        System.out.println("Is 3 present in the list? " + search(list, 3)); // true
        System.out.println("Is 6 present in the list? " + search(list, 6)); // false

        // Print the list in forward and backward directions
        printListForward(list);
        printListBackward(list);

        System.out.println("Length of the linked list: " + findLength(list));

        // Delete node with value 3
        list = delete(list, 3);
        printListForward(list);
        printListBackward(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Delete node with value 1
        list = delete(list, 1);
        printListForward(list);
        printListBackward(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Delete node with value 5
        list = delete(list, 5);
        printListForward(list);
        printListBackward(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Try to delete node with value 10 (not present)
        list = delete(list, 10);
        printListForward(list);
        printListBackward(list);
        System.out.println("Length of the linked list: " + findLength(list));
    }
}
