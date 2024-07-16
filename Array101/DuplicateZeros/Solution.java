package Array101.DuplicateZeros;

class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleZeroDups = 0;
        int lastIdx = arr.length - 1;

        for (int i = 0; i <= lastIdx - possibleZeroDups; i++) {
            if (arr[i] == 0) {
                // edge case
                if (i == lastIdx - possibleZeroDups) {
                    arr[lastIdx] = 0;
                    lastIdx -= 1;
                    break;
                }
                possibleZeroDups++;
            }
        }

        int newLastIdx = lastIdx - possibleZeroDups;

        for (int i = newLastIdx; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleZeroDups] = 0;
                possibleZeroDups--;
                arr[i + possibleZeroDups] = 0;
            } else {
                arr[i + possibleZeroDups] =
            }
        }
    }
}