class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < a.length; i++) {
            if (sentence.indexOf(a[i]) == -1) {
                return false;
            }
        }
        return true;
    }
}
