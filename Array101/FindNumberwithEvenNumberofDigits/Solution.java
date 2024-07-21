package Array101.FindNumberwithEvenNumberofDigits;

class Solution {

    public boolean numberHasEvenDigits(int num) {
        int digitsCount = 0;
        while (num != 0) {
            num = num / 10;
            digitsCount++;
        }
        return digitsCount % 2 == 0;
    }
    //Approach 1
    public int findNumbers1(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (numberHasEvenDigits(nums[i])) {
                evenCount++;
            }
        }
        return evenCount;
    }

    //Approach 2
    public int findNumbers2(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            int len = String.valueOf(num).length();
            if (len % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }


    //Approach 3
        public int findNumbers3(int[] nums) {
            int evenCount = 0;
            for (int num: nums) {
                int digitCount = (int) Math.floor(Math.log10(num)) + 1;
                if (digitCount % 2 == 0) {
                    evenCount++;
                }
            }
            return evenCount;
        }


        //Approach 4
        public int findNumbers4(int[] nums) {
            int evenCount = 0;
            for (int num : nums) {
                int digitCount = (int) Math.floor(Math.log10(num)) + 1;
                if (digitCount % 2 == 0) {
                    evenCount++;
                }
            }
            return evenCount;
        }
}
