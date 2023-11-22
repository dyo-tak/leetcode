class Solution {

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int originalColor = image[sr][sc];

    if (originalColor == newColor) {
      return image;
    }

    floodFillHelper(image, sr, sc, originalColor, newColor);

    return image;
  }

  private void floodFillHelper(int[][] image, int sr, int sc, int originalColor, int newColor) {
    if (!isValid(image, sr, sc) || image[sr][sc] != originalColor) {
      return;
    }

    image[sr][sc] = newColor;

    floodFillHelper(image, sr + 1, sc, originalColor, newColor);
    floodFillHelper(image, sr, sc + 1, originalColor, newColor);
    floodFillHelper(image, sr - 1, sc, originalColor, newColor);
    floodFillHelper(image, sr, sc - 1, originalColor, newColor);
  }

  private boolean isValid(int[][] image, int sr, int sc) {
    return sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length;
  }
}


class Main {

  public static void main(String[] args) {}
}
