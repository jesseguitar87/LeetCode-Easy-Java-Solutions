class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = 0;
        Boolean found = false;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && j - i > max) {
                    max = j - i - 1;
                    found = true;
                }
            }
        }
        if (max >= 0 && found == true) {
            return max;
        }
        return -1;
    }
}
