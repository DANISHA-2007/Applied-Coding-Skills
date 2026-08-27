class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2

Input:
head = [1,2,3,4,5]

Output:
[3,4,5]

Expected:
[3,4,5]
