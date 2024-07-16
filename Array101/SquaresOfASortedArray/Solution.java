package Array101.SquaresOfASortedArray;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0,
                r = nums.length - 1;

        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int val;

            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                val = nums[l];
                l++;
            } else {
                val = nums[r];
                r--;
            }

            result[i] = val * val;
        }

        return result;
    }
}
