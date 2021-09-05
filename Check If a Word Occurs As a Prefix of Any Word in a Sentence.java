class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splits = sentence.split(" ");
        for (int i = 0; i < splits.length; i++) {
            String str = "";
            for (int j = 0; j < splits[i].length(); j++) {
                str += splits[i].charAt(j);
                if (str.equals(searchWord)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
