package General.AddTwoNumbers;

class Solution {
    // Add Two Numbers (Java improved)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head for the result linked list
        ListNode dHead = new ListNode(0);
        ListNode curr = dHead;
        int carry = 0;
        // Iterate through both lists and continue until both lists are exhausted and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            // Calculate sum including carry from previous operation
            int sum = carry + a + b;
            // Determine the new carry for the next operation
            carry = sum / 10;
            // Create a new node with the digit in the units place of sum
            curr.next = new ListNode(sum % 10);
            // Move the pointer to the next node in the result list
            curr = curr.next;
            // Move to the next nodes in l1 and l2, if they exist
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        // Return the next node of the dummy head, which is the actual start of the result list
        return dHead.next;
    }

    // Definition of ListNode class
    class ListNode {
        int val;
        ListNode next;

        // Constructor to initialize ListNode with a value
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}