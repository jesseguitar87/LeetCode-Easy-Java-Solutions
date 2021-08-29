class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int k = 0;
        int[] bad = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 1) {
                bad[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            Boolean found = false;
            for (int j = 0; j < bad.length; j++) {
                if (nums[i] == bad[j]) {
                    found = true;
                }
            }
            if (found == false) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
