class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[k] = nums[j];
                k++;
            }
        }
        for (int i = nums.length-1; i > nums.length-1 - count; i--) {
            nums[i] = 0;
        }
    }
}
