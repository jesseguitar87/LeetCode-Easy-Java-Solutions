class Solution {
    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        int pro = 1;
        for (int i = 0; i < str.length(); i++) {
            pro *= Character.getNumericValue(str.charAt(i));
            sum += Character.getNumericValue(str.charAt(i));
        }
        return pro - sum;
    }
}
