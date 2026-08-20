class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1

Input:
["RecentCounter","ping","ping","ping","ping"]

[[],[1],[100],[3001],[3002]]

Output:
[null,1,2,3,3]

Expected:
[null,1,2,3,3]