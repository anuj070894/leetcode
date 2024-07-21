package Array101.SquaresOfASortedArray;

import java.util.Arrays;

class Solution {

        //approach 1
        public int[] sortedSquares(int[] nums) {
            int N = nums.length;
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = nums[i] * nums[i];
            }
            Arrays.sort(result);
            return result;
        }

    //approach 1
        public int[] sortedSquares2(int[] nums) {
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
