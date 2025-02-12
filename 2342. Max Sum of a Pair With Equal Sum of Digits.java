class Solution {
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int num:nums){
            int sumDigit =  sumOfDigits(num);
            if(!map.containsKey(sumDigit)){
                map.put(sumDigit,new ArrayList<>());
            }
            map.get(sumDigit).add(num);
        }

        int maxValue = -1;
        for(int key:map.keySet()){
            List<Integer> curList = map.get(key);
            int curListSize = curList.size();
            if(curListSize<=1){
                continue;
            }
            maxValue = Math.max(maxValue,curList.get(curListSize-1)+curList.get(curListSize-2));
        }
        return maxValue;

    }

    public int sumOfDigits(int num){
        int cur = 0;
        while(num!=0){
            cur += num%10;
            num /=10;
        }
        return cur;
    }
}2
