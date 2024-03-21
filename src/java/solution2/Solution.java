/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package solution2;

/**
 *
 * @author DELL
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tail = result;

        int number1;
        int number2;
        int sum;
        int store = 0;
        int remainder;
        while (l1 != null || l2 != null || store != 0) {
            number1 = (l1 == null) ? 0 : l1.val;
            number2 = (l2 == null) ? 0 : l2.val;
            sum = number1 + number2 + store;
            remainder = sum % 10;
            store = sum / 10;
            tail.next = new ListNode(remainder);
            tail = tail.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return result.next;
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Hàm này để in ra các giá trị của các node trong danh sách liên kết
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        ListNode l1 = createLinkedList(arr1);
        ListNode l2 = createLinkedList(arr2);

        // Đoạn mã này sẽ in ra giá trị của các node trong danh sách liên kết
        printLinkedList(l1);
        printLinkedList(l2);
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        printLinkedList(result);

    }
}
