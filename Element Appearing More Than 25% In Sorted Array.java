class Solution {
    public int findSpecialInteger(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length/4) {
                return arr[i];
            }
        }
        return 0;
    }
}
