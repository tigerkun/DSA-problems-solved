class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode current = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        current = first;

        while (current.next != null) {
            current = current.next;
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
