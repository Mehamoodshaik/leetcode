class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n>m){
            return false;
        }
        int i = 0;
        for(int j=0;j<m && i<n;j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
       return i==n;
    }
}

/*
Intuition
The problem is to check if string s is a subsequence of string t. The key is to maintain the relative order of characters in s while traversing through t.

Approach
Initial Check: If the length of s is greater than t, s cannot be a subsequence of t.
Traverse t: Use a pointer i to track the position in s. Iterate through t and whenever a character in t matches the current character in s, move the pointer i to the next character in s.
Final Check: After the loop, if i equals the length of s, it means all characters in s have been matched in t.
Complexity Analysis
Time Complexity: ( O(m) )

The loop runs at most m times, where m is the length of t. The pointer i might move through all characters of s but does not add extra complexity beyond m.
Space Complexity: ( O(1) )

The algorithm uses a constant amount of extra space (i and j), so the space complexity is constant.
*/
