class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // The array is sorted, so we can start from both ends.
        int left = 0;
        int right = numbers.length - 1;

        // Keep searching while the two pointers represent
        // two different elements.
        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {

                // The problem uses 1-based indexing,
                // so convert our 0-based Java indices to 1-based.
                return new int[] {left + 1, right + 1};

            } else if (sum < target) {

                // The sum is too small.
                // Since the array is sorted, moving left forward
                // gives us a larger value and therefore a larger sum.
                left++;

            } else {

                // The sum is too large.
                // Moving right backward gives us a smaller value
                // and therefore a smaller sum.
                right--;
            }
        }

        // No valid pair was found.
        return new int[] {};
    }
}