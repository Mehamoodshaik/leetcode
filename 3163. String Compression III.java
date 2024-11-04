class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int iter = 0;
        while(iter<n){
            int curCharFreq =0;
            char c = word.charAt(iter);
            while(iter<n && word.charAt(iter)==c && curCharFreq<9){
                iter++;
                curCharFreq++;
            }
            sb.append(curCharFreq).append(c);
        }

        return sb.toString();
    }
}
