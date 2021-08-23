class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int lCount = 0;
        int rCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lCount++;
            } else if (s.charAt(i) == ')') {
                rCount++;
            }
            if (lCount - rCount > max) {
                max = lCount - rCount;
            }
        }
        return max;
    }
}
