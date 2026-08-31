class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int first = -1;
        int previous = -1;

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        int position = 1;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {

            ListNode next = curr.next;

            // Check if current node is a critical point
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (first == -1) {
                    first = position;
                }

                if (previous != -1) {
                    minDistance = Math.min(
                        minDistance,
                        position - previous
                    );
                }

                previous = position;
            }

            prev = curr;
            curr = next;
            position++;
        }

        // Fewer than two critical points
        if (first == -1 || first == previous) {
            return new int[] {-1, -1};
        }

        maxDistance = previous - first;

        return new int[] {minDistance, maxDistance};
    }
}
