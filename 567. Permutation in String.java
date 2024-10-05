class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2){
            return false;
        }
        int[] charS1 = new int[26];
        int[] charS2 = new int[26];
        for(int i=0;i<l1;i++){
            charS1[s1.charAt(i)-'a']++;
            charS2[s2.charAt(i)-'a']++;
        }
        if(bothEquals(charS1,charS2)){
            return true;
        }
        for(int i=l1;i<l2;i++){
            charS2[s2.charAt(i-l1)-'a']--;
            charS2[s2.charAt(i)-'a']++;
            if(bothEquals(charS1,charS2)){
                return true;
            }
        }
        return false;
    }
    private boolean bothEquals(int[] charS1, int[] charS2){
        for(int i=0;i<26;i++){
            if(charS1[i]!=charS2[i]){
                return false;
            }
        }
        return true;
    }
}
