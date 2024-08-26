class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}

/*
Intuition
The problem asks us to find two numbers in an array that add up to a specific target. A straightforward approach would be to check every pair of numbers in the array, but that would be inefficient. Instead, we can use a hashmap (or dictionary) to store the numbers we've seen so far and their indices. This allows us to find the complement of the current number (i.e., target - current number) in constant time, significantly improving the efficiency of our solution.

Approach
Initialize a HashMap:
We use a HashMap to store each number in the array as a key and its index as the corresponding value.
Iterate Through the Array:
For each element in the array:
Compute the complement of the current element as complement = target - nums[i].
Check if this complement is already present in the map.
If the complement exists in the map, it means we've already encountered the number that can be added to the current element to reach the target. We return the indices of these two numbers.
If the complement is not found, add the current element and its index to the map for future reference.
Return the Result:
The indices of the two numbers that add up to the target are returned as an array. If no such pair is found (which shouldn't happen according to the problem statement), an empty array is returned.
Complexity
Time complexity: O(n)
We traverse the array only once, and each lookup or insertion operation in the HashMap takes constant time, O(1). Therefore, the overall time complexity is linear, O(n), where n is the number of elements in the array.
Space complexity: O(n)
In the worst case, we might store all n elements in the HashMap, so the space complexity is also O(n).
*/
