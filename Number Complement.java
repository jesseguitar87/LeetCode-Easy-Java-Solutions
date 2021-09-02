class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String rep1 = bin.replace('1','2');
        String rep2 = rep1.replace('0','1');
        String rep3 = rep2.replace('2','0');
        return Integer.parseInt(rep3,2);
    }
}
