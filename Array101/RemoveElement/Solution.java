package Array101.RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        // approach 2
        int n = nums.length;

        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }
}
