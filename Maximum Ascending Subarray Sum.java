class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int test = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j-1] < nums[j]) {
                    test += nums[j];
                } else {
                    if (test > max) {
                        max = test;
                    }
                    break;
                }
            }
            if (test > max) {
                max = test;
            }
        }
        return max;
    }
}
