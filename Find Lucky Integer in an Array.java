class Solution {
    public int findLucky(int[] arr) {
        ArrayList<Integer> checked = new ArrayList<Integer>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checked.indexOf(arr[i]) == -1) {
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                checked.add(arr[i]);
                if (count == arr[i] && arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        if (max > 0) {
            return max;
        }
        return -1;
    }
}
