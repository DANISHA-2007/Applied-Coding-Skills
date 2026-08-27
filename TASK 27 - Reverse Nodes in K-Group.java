class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        ListNode prev = null;
        current = head;

        for (int i = 0; i < k; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = reverseKGroup(current, k);

        return prev;
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2

Input:
head = [1,2,3,4,5]
k = 2

Output:
[2,1,4,3,5]

Expected:
[2,1,4,3,5]
