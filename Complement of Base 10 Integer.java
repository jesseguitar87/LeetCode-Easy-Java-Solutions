class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        String str = "";
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0') {
                str += '1';
            } else if (bin.charAt(i) == '1') {
                str += '0';
            }
        }
        return Integer.parseInt(str,2);
    }
}
