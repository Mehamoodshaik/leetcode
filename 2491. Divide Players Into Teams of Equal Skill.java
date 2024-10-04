class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        
        int left = 0;
        int right = n-1;
        int pairCount = 1;
        int targetSkill = skill[left]+skill[right];
        long chemistry = skill[left]*skill[right];
        if (n==2){
            return chemistry;
        }
        left++;
        right--;
        
        while(left<right){
            int curSkill = skill[left]+skill[right];
            if(curSkill==targetSkill){
                pairCount++;
                chemistry += skill[left]*skill[right];
                left++;
                right--;
            }
            else if(curSkill>targetSkill){
                right--;
            }
            else{
                left++;
            }
        }
        if(pairCount==n/2){
            return chemistry;
        }
        return -1;
    }
}
        
