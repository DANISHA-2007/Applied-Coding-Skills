class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char task : tasks) {
            count[task - 'A']++;
        }

        int max = 0;

        for (int c : count) {
            max = Math.max(max, c);
        }

        int maxCount = 0;

        for (int c : count) {
            if (c == max) {
                maxCount++;
            }
        }

        int result = (max - 1) * (n + 1) + maxCount;

        return Math.max(result, tasks.length);
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1

Input:
tasks = ["A","A","A","B","B","B"]
n = 2

Output:
8

Expected:
8