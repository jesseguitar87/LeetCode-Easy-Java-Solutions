class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0;
        int hor = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                ver++;
            }
            if (moves.charAt(i) == 'D') {
                ver--;
            }
            if (moves.charAt(i) == 'L') {
                hor--;
            }
            if (moves.charAt(i) == 'R') {
                hor++;
            }
        }
        if (ver == 0 && hor == 0) {
            return true;
        }
        return false;
    }
}
