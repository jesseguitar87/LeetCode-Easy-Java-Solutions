class Solution {
    public int xorOperation(int n, int start) {
        if (n == 1) {
            return start;
        }
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2*i;
        }
        int ans = nums[0] ^ nums[1];
        for (int i = 2; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
