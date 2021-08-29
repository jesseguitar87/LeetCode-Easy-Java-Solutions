class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String str = "";
            for (int j = i; j < word.length(); j++) {
                str += word.charAt(j);
                for (int k = 0; k < patterns.length; k++) {
                    if (patterns[k].equals(str)) {
                        count++;
                        patterns[k] = "";
                    }
                }
            }
        }
        return count;
    }
}
