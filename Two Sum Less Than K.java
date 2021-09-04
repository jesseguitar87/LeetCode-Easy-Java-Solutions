class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] + nums[j] < k && max < nums[i] + nums[j]) {
                    max = nums[i] + nums[j];
                }
            }
        }
        if (max > 0) {
            return max;
        }
        return -1;
    }
}
