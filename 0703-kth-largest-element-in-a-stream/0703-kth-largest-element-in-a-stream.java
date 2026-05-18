import java.util.PriorityQueue;

class KthLargest {

    int k;
    PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {

        this.k = k;

        minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {

            minHeap.offer(nums[i]);

            if (minHeap.size() > k) {
                minHeap.poll();  //poll() removes heap top.
            }
        }
    }

    public int add(int val) {

        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}