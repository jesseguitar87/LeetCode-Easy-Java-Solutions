class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans= new ArrayList<String>();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i >= 5) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0 && i >= 3) {
                ans.add("Fizz");
            } else if (i % 5 == 0 && i >= 5) {
                ans.add("Buzz");
            } else {
                if (i > 0) {
                ans.add(String.valueOf(i));
                }
            }
        }
        return ans;
    }
}
