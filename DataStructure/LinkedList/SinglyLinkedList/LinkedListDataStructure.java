package DataStructure.LinkedList.SinglyLinkedList;

public class LinkedListDataStructure {

    Node head;

    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedListDataStructure insert(LinkedListDataStructure list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    // Method to delete node 
    public static LinkedListDataStructure delete(LinkedListDataStructure list, int key) {
        Node currNode = list.head;
        Node prev = null;

        // case 1 : If key is found in the head node
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " found and delete");
            return list;
        }

        // case 2 : if the key is middle or last node
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            System.out.println("Previous Node is = " + prev.data);
            currNode = currNode.next;
            System.out.println("Current Node is = " + currNode.data);
        }

        // if the key was found, it will be in current node
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and delete");
            //System.out.println("After deleting previous node is " + prev.next.data);
        }

        // case 3 : if the key is not found
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        
        return list;
    }

    // method to find length of linked list
    public static int findLength(LinkedListDataStructure list) {
        int length = 0;
        Node currNode = list.head;

        while (currNode != null) {
            length++;
            currNode = currNode.next;
        }

        return length;
    }

    // method to find an element present in linked list
    public static boolean search(LinkedListDataStructure list, int key) {
        Node currNode = list.head;

        while (currNode != null) {
            if (currNode.data == key) {
                return true;
            }
            currNode = currNode.next;
        }

        return false;
    }

    public static void printList(LinkedListDataStructure list) {
        Node currNode = list.head;
        System.out.println("Linked List = ");

        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDataStructure list = new LinkedListDataStructure();

        list = insert(list, 1);
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5);

        // Search for elements
        System.out.println("Is 3 present in the list? " + search(list, 3)); // true
        System.out.println("Is 6 present in the list? " + search(list, 6)); // false

        printList(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Delete node with value 3
        list = delete(list, 3);
        printList(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Delete node with value 1
        list = delete(list, 1);
        printList(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Delete node with value 5
        list = delete(list, 5);
        printList(list);
        System.out.println("Length of the linked list: " + findLength(list));

        // Try to delete node with value 10 (not present)
        //list = delete(list, 10);
        //printList(list);
        //System.out.println("Length of the linked list: " + findLength(list));
    }
}