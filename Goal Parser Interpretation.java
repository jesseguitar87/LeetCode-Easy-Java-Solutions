class Solution {
    public String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                ans += 'G';
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                ans += 'o';
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
                ans += "al";
            }
        }
        return ans;
    }
}
