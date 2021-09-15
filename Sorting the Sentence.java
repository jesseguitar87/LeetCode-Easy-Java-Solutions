class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        int i = 1;
        String str = "";
        while (i <= words.length) {
        for (String word : words)
        if (Integer.parseInt(word.substring(word.length()-1, word.length())) == i) {
            str += word.substring(0, word.length()-1);
            if (i != words.length) {
                str += " ";
            }
            i++;
        }
        }
        return str;
    }
}
