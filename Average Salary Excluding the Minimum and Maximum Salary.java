class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }
        }
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != min && salary[i] != max) {
                sum += salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}
