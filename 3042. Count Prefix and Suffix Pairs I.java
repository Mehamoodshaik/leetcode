class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isSuffixAndPrefix(words[i],words[j])) res++;
            }
        }
        return res;
    }

    public boolean isSuffixAndPrefix(String str1, String str2){
        if(str2.startsWith(str1) && str2.endsWith(str1)){
            return true;
        }
        return false;
    }
}
