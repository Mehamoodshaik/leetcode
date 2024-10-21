class Solution {

    public int maxUniqueSplit(String s) {
        Set<String> seen = new HashSet<>();
        return backtrack(s, 0, seen);
    }

    private int backtrack(String s, int start, Set<String> seen) {

        if (start == s.length())
            return 0;

        int maxCount = 0;

        for (int end = start + 1; end <= s.length(); ++end) {
            String substring = s.substring(start, end);

            if (!seen.contains(substring)) {

                seen.add(substring);
                maxCount = Math.max(maxCount, 1 + backtrack(s, end, seen));
                seen.remove(substring);
            }
        }
        return maxCount;
    }
}
