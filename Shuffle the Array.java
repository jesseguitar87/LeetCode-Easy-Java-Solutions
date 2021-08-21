class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length/2; i++) {
            ans[j] = nums[i];
            ans[j+1] = nums[(nums.length/2) + i];
            j += 2;
        }
        return ans;
    }
}
