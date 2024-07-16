package General.LongestSubstringWithoutRepeatingCharacters;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

    /* Approach 1
        Time Complexity:
        O(n^3)
        Space Complexity:
        Size of the set
    */
    public int lengthOfLongestSubstring_1(String s) {
        int len = s.length();
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (checkUniqueChars(s, i, j)) {
                    // apple
                    // i = 0, j = 1
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public boolean checkUniqueChars(String s, int startIdx, int endIdx) {
        Set<Character> chars = new HashSet<>();
        for (int i = startIdx; i <= endIdx; i++) {
            char c = s.charAt(i);
            if (chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }
        return true;
     }

     /*  Approach 2
         Sliding window approach
          Time Complexity:  O(n) = 2n
          Space Complexity: Size of the set
    */
    public int lengthOfLongestSubstring_2(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        int leftIdx = 0,
                rightIdx = 0;
        int maxLen = 0;
        while (rightIdx < s.length()) {
            char currChar = s.charAt(rightIdx);
            counts.put(currChar, counts.getOrDefault(currChar, 0) + 1);
            while (counts.get(currChar) > 1) {
                char charAtLeft = s.charAt(leftIdx);
                counts.put(charAtLeft, counts.get(charAtLeft) - 1);
                leftIdx++;
            }
            maxLen = Math.max(maxLen, leftIdx - rightIdx + 1);
            rightIdx++;
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring_3(String s) {
        int strLen = s.length();
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int rightIdx = 0, leftIdx = 0; rightIdx < strLen; rightIdx++) {
            if (map.containsKey(s.charAt(rightIdx))) {
                leftIdx = Math.max(map.get(s.charAt(rightIdx)), leftIdx);
            }
            maxLen = Math.max(maxLen, rightIdx - leftIdx + 1);
            map.put(s.charAt(rightIdx), rightIdx + 1);
        }
        return maxLen;
    }
    }



