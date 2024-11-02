class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;
        if (words[0].charAt(0)!=words[n-1].charAt(words[n-1].length()-1)) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)) {
                return false;
            }
        }
        return true;
    }
}
