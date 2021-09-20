class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String codes[] = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String str = "";
            for (int j = 0; j < words[i].length(); j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == words[i].charAt(j)) {
                        str += morse[k];
                    }
                }
            }
            codes[i] = str;
        }
        ArrayList<String> filtered = new ArrayList<String>();
        for (int i = 0; i < codes.length; i++) {
            if (filtered.indexOf(codes[i]) == -1) {
                filtered.add(codes[i]);
            }
        }
        return filtered.size();
    }
}
