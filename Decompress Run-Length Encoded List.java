class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                ans.add(nums[i+1]);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
