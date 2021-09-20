class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int[] arr = new int[image[i].length];
            int k = 0;
            for (int j = image[i].length-1; j >= 0; j--) {
                arr[k] = image[i][j];
                k++;
            }
            image[i] = arr;
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
