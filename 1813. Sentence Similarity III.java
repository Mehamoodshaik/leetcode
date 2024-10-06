class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // If the two sentences are the same, return true
        if (sentence1.equals(sentence2)) {
            return true;
        }

        // Split sentences into words based on spaces
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        int i = 0; // index for the start comparison (prefix)
        int j = 0; // index for the end comparison (suffix)

        // Check for common prefix
        while (i < words1.length && i < words2.length && words1[i].equals(words2[i])) {
            i++;
        }

        // Check for common suffix
        while (j < words1.length - i && j < words2.length - i
               && words1[words1.length - 1 - j].equals(words2[words2.length - 1 - j])) {
            j++;
        }

        // If all words have been matched either in the prefix or suffix, return true
        return (i + j) == Math.min(words1.length, words2.length);
    }
}
