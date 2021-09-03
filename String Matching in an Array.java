class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<String>();  
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                String str = "";
                for (int k = j; k < words[i].length(); k++) {
                    str += words[i].charAt(k);
                    for (int l = 0; l < words.length; l++) {
                        if (l != i && str.equals(words[l]) && ans.indexOf(words[l]) == -1) {
                            ans.add(words[l]);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
