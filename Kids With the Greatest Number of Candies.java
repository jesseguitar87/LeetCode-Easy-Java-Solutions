class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            if (candies[i] == Arrays.stream(candies).max().getAsInt()) {
                result.add(true);
            } else {
                result.add(false);
            }
            candies[i] -= extraCandies;
        }
        return result;
    }
}
