class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to simplify removals
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node
            } else {
                current = current.next; // Move forward
            }
        }
        return dummy.next; // New head
    }
}
