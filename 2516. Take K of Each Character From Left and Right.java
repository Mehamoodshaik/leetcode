class Solution {
    public int takeCharacters(String s, int k) {
        int[] count = new int[3];
        int n = s.length();

        for(char c:s.toCharArray()){
            count[c-'a']++;
        }

        for(int i=0;i<3;i++){
            if(count[i]<k){
                return -1;
            }
        }

        int[] window = new int[3];

        int left =0, maxWindow = 0, right =0;
        while(right<n){
            char c = s.charAt(right);
            window[c-'a']++;
            while(left<=right && window[c-'a']>count[c-'a']-k){
                window[s.charAt(left)-'a']--;
                left++;
            }
            maxWindow = Math.max(maxWindow,right-left+1);
            right++;
        }

        return n- maxWindow;
    }
}


/*
Intuition
Instead of deciding whether to take or skip each individual character, we can use a sliding window approach to identify which characters we don't need to 'take' to get to at least k of each character.

First things first, we'll rule out cases where this is impossible by counting the total occurrences of each character in s. If any character occurs fewer than k times, return -1.

Now the core idea of this solution is to identify the largest removable window in the string such that removing it still leaves at least k occurrences of each character 'a', 'b', and 'c'. The number of minutes required to perform this task corresponds to the length of the string minus the size of the largest such window.

To achieve this, we iterate through the string to locate the window using two pointers, left and right. The pointer right progressively expands the window by including characters, one at a time, into the current window. Simultaneously, the pointer left is used to shrink the window whenever the current configuration violates the condition that at least k occurrences of each character must remain outside the window.

As we increment right, we add the character at that position to the window and update the counts. If adding this character results in too few occurrences of any character outside the window, we increment left to remove characters from the start of the window, restoring the required character counts outside the window.

Whenever a valid window is identified—where the counts of 'a', 'b', and 'c' outside the window are all at least k—we calculate the size of the current window. If this size is larger than previously identified windows, we update maxWindow. The final result is derived by subtracting the size of the largest valid window (maxWindow) from the total string length, effectively calculating the smallest portion of the string that must be removed.

After completing the iteration, the minimum number of minutes required is given by subtracting the size of the largest valid window from the total length of the string.

More mathematically, this can be expressed as: Minimum Minutes=Length of String−Size of the Largest Valid Window


Algorithm
Initialize a count array of size 3 to keep track of the frequency of characters 'a', 'b', and 'c' in the string.

Iterate through the string s to populate the count array with the total occurrences of each character ('a', 'b', 'c').

If any character in the string occurs fewer than k times, return -1 (since it is impossible to satisfy the condition of having at least k of each character).

Initialize a window array of size 3 to track the counts of 'a', 'b', and 'c' within the current sliding window.

Set the left pointer to 0 and maxWindow to 0, which will store the length of the longest valid window.

Iterate over the string using a right pointer:

Increment the count of the current character in the window array.

If the window contains too many characters of any type (i.e., fewer than k characters are outside the window), shrink the window from the left:

Decrease the count of the character at the left pointer.
Move the left pointer to the right.
Update maxWindow to be the maximum of its current value and the current window size (right - left + 1).

After the loop, return n - maxWindow, which represents the minimum number of characters to be removed from the string to satisfy the condition of having at least k of each character.
*/
