class Solution {
    public boolean isArmstrong(int n) {
        int sum = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            int num = Character.getNumericValue(str.charAt(i));
            double pow = Math.pow(num, str.length());
            int val = (int)pow;
            sum += val;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
