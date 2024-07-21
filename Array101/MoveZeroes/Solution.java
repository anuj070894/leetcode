package Array101.MoveZeroes;

public class Solution {

    public void moveZeroes(int[] nums) {
        // approach 1
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            res[j] = 0;
            j++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }

    // approach 2
    public void moveZeroes1(int[] nums) {

        int slow = 0,
                fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        while (slow < nums.length) {
            nums[slow] = 0;
            slow++;
        }
    }

  // approach 3
  public void moveZeroes2(int[] nums) {

        int slow = 0,
                fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
    }
}
