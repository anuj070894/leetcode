package General.TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Brute force approach 1
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] == target - nums[j]) {
                     return new int[] {i, j};
                 }
             }
         }
        //Approach 2
         Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             map.put(nums[i], i);
         }
         for (int i = 0; i < nums.length; i++) {
             int remain = target - nums[i];
             if (map.containsKey(remain) && map.get(remain) != i) {
                 return new int[] {i, map.get(remain)};
             }
         }
        //Approach 3
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map2.containsKey(remain)) {
                return new int[] {i, map2.get(remain)};
            }
            map2.put(nums[i], i);
            // [2,7,11,15]
            // map -> 2:0, 7
        }
        return null;
    }
}