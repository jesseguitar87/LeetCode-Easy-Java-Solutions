class Solution {
    public int sumOfDigits(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        String str = String.valueOf(min);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        if (sum % 2 != 0) {
            return 0;
        }
        return 1;
    }
}
