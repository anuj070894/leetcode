package Array101.FindAllNumbersAisappearedInArray;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {

    //approach 1
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        List<Integer> res = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    //approach 2
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int currNum = Math.abs(nums[i]);
            int idx = currNum - 1;
            if (nums[idx] < 0) {
                continue;
            }
            nums[idx] = -1 * nums[idx];
        }
        List<Integer> res = new LinkedList<>();
        // 1   1
        // -1  1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
