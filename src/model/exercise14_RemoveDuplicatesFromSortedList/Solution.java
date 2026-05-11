package model.exercise14_RemoveDuplicatesFromSortedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Si la lista está vacía o tiene un solo nodo, no hay duplicados
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Si el valor es igual al siguiente, saltamos el nodo duplicado
                current.next = current.next.next;
            } else {
                // Si son diferentes, avanzamos al siguiente nodo
                current = current.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Main{
    public static void main(String[] args) {
        ListNode n5 = new ListNode(3);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(1, n3);
        ListNode head = new ListNode(1, n2);

        System.out.println("Lista original:");
        printList(head);

        Solution sol = new Solution();
        ListNode result = sol.deleteDuplicates(head);

        System.out.println("\nLista sin duplicados:");
        printList(result);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }
}