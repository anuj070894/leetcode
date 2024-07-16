package Array101.CheckIfNAndItsDoubleExist;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(2 * num) || (set.contains(num / 2) && (num % 2 == 0))) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}