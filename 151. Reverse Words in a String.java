//151. Reverse Words in a String.java -- Mehamood Shaik-- 
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sArray = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=sArray.length-1;i>=0;i--){
            res.append(sArray[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}


/*
Intuition:
The problem asks us to reverse the order of words in a given string. A word is defined as a sequence of non-space characters. The most straightforward approach is to first split the string into individual words, then reverse the order of these words, and finally join them back into a single string.

Approach:
Trim the Input String: We start by trimming any leading or trailing whitespace from the input string using trim(). This ensures that there are no unnecessary spaces at the beginning or end of the string.

Split the String: We then split the string into words using the split("\s+") method. The regular expression \s+ matches one or more spaces, ensuring that we handle multiple spaces between words correctly. This creates an array where each element is a word from the original string.

Reverse the Word Order: We use a StringBuilder to construct the result string. We iterate over the array of words in reverse order, appending each word to the StringBuilder.

Handle Spacing: While appending the words, we add a space after each word except the last one. This ensures that the words are correctly separated by single spaces in the final string.

Return the Result: Finally, we convert the StringBuilder to a string and return it.

Complexity:
Time Complexity: The time complexity is O(n), where n is the length of the input string. This includes:
O(n) for trimming the string. O(n) for splitting the string into words. O(n) for iterating through the words and constructing the result.
Space Complexity: The space complexity is O(n), where n is the length of the input string. This accounts for:
The space used by the array of words created by split().
The space used by the StringBuilder to store the reversed words.
*/
