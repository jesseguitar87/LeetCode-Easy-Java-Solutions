class Solution {
    public String restoreString(String s, int[] indices) {
        char[] t = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            t[indices[i]] = s.charAt(i);
        }
        String str = new String(t);
        String ans = String.valueOf(str);
        return ans;
    }
}
