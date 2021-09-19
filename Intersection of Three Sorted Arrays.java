class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if (Arrays.binarySearch(arr2, arr1[i]) >= 0 && Arrays.binarySearch(arr3, arr1[i]) >= 0) {
                ans.add(arr1[i]);
            }
        }
        return ans;
    }
}
