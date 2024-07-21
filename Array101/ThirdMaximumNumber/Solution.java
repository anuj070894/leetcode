package Array101.ThirdMaximumNumber;

import java.util.Arrays;

class Solution {


    //approach 1
    public int thirdMax(int[] nums) {
        // approach 1
        Arrays.sort(nums);
        int i = 0,
                j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int elemCount = 1;
        for (int k = 1; k < nums.length; k++) {
            if (nums[k] != nums[k - 1]) {
                elemCount++;
            }
            if (elemCount == 3) {
                return nums[k];
            }
        }
        return nums[0];
    }

    //approach 1
    public int thirdMax2(int[] nums) {
        Integer max1 = null,
                max2 = null,
                max3 = null;
        for (int i = 0; i < nums.length; i++) {
            if (max1 != null && max1 == nums[i]) {
                continue;
            }
            if (max2 != null && max2 == nums[i]) {
                continue;
            }
            if (max3 != null && max3 == nums[i]) {
                continue;
            }
            if (max1 == null || nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (max2 == null || nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (max3 == null || nums[i] > max3) {
                max3 = nums[i];
            }
        }
        if (max3 != null) {
            return max3;
        }
        return max1;
    }
}