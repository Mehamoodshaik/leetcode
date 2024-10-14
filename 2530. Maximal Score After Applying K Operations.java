class Solution {
    public long maxKelements(int[] nums, int k) {
        // Create a max-heap (priority queue)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (n1, n2) -> n2 - n1
        );
        
        // Add all elements of the array to the max-heap
        for (int num : nums) {
            maxHeap.offer(num);
        }

        long score = 0;
        
        // Process k largest elements
        while (!maxHeap.isEmpty() && k > 0) {
            int num = maxHeap.poll(); // Get the largest element
            score += num;             // Add it to the score
            
            // Update the number by dividing by 3 and rounding up
            num = (num + 2) / 3;
            maxHeap.offer(num);       // Add the updated number back into the heap
            
            k--; // Decrement the number of operations
        }

        return score;
    }
}
