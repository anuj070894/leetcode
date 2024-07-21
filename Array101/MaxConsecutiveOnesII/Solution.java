package Array101.MaxConsecutiveOnesII;

class Solution {

    //approach 1
    public int findMaxConsecutiveOnes(int[] nums) {
        // approach 2
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroes = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeroes += 1;
                }
                if (zeroes > 1) {
                    break;
                }
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }

    //approach 2
    public int findMaxConsecutiveOnes2(int[] nums) {
        int i = 0,
                j = 0,
                max = 0,
                zeroes = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                zeroes += 1;
            }
            while (zeroes == 2) {
                if (nums[j] == 0) {
                    zeroes -= 1;
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
            i++;
        }
        return max;
    }
}
