class Solution {
    public String truncateSentence(String s, int k) {
        String ans = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return ans;
                } else {
                    ans += ' ';
                }
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
