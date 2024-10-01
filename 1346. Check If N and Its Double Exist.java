class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
        // Check if double or half exists in the set
            if(set.contains(num*2) || (num%2==0 && set.contains(num/2))){
                return true;
            }
            // Add the current number to the set
            set.add(num);
        }
        return false;
    }
}
