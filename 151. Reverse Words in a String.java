//151. Reverse Words in a String.java -- Mehamood Shaik-- 
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        if(s.length()==0 || s.length()==1){
            return s;
        }
        StringBuilder res = new StringBuilder();
        int end = s.length()-1;
        int start;
        while(end>=0){
            start = end;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            res.append(s.substring(start+1,end+1)).append(" ");
            end =  start-1;
            while(end>=0 && s.charAt(end)==' '){
                end--;
            }
        }
        return res.toString().trim();
    }
}

/*
Intuition:
The goal is to reverse the order of words in a string. A simple and efficient way to approach this problem is by using the two-pointer technique, which allows us to reverse the words in a single pass without needing additional space for storing the reversed words separately.

Approach:
Trimming and Splitting:

Start by trimming any leading or trailing spaces from the input string. This ensures that we don't accidentally include unnecessary spaces.
Use a regular expression (\\s+) to split the string by one or more spaces, producing an array of words.
Two-Pointer Technique:

Use two pointers to navigate the array: one pointer starting from the beginning of the string (left) and the other from the end (right).
Move the right pointer leftward to skip over any trailing spaces and find the start of the last word.
Move the left pointer rightward to identify each word and append it to the result in reverse order.
Append each word to the result string, and insert a single space between words.
Rebuild the String:

Append each word to a StringBuilder and ensure that a space is added between words, except after the last word.
Finally, convert the StringBuilder to a string and return it as the result.
Time Complexity:
Time Complexity: O(n), where n is the length of the string. This is because we perform a single pass over the string for trimming, splitting, and rearranging the words.
Space Complexity: O(n), as we are storing the words in an array and using a StringBuilder to build the final string.
*/
