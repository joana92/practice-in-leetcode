public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 0) {
            return 0;
        }

        int start = 0, end = nums.length - 1, mid = end / 2;
        while (start + 1 < end) {
            mid = start + (end - start)/2;
            if (nums[mid] < nums[mid - 1]) {
                end = mid;
            } else if (nums[mid] < nums[mid + 1]) {
                start = mid;
            } else {
                return mid;
            }
        }

        mid = (nums[start] > nums[end]) ? start : end;
        return mid;
    }
}
