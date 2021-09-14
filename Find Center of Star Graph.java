class Solution {
    public int findCenter(int[][] edges) {
        int testOne = edges[0][0];
        int testTwo = edges[0][1];
        for (int i = 0; i < edges.length; i++) {
            if (edges[i][0] != testOne && edges[i][1] != testOne) {
                return testTwo;
            }
        }
        return testOne;
    }
}
