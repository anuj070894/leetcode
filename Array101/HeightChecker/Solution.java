package Array101.HeightChecker;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        Integer[] res = new Integer[heights.length];
        for (int i = 0; i < heights.length; i++) {
            res[i] = heights[i];
        }
        Arrays.sort(res);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != res[i]) {
                count++;
            }
        }
        return count;
    }
}
