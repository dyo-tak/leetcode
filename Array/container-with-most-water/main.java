class Solution {
    public int maxArea(int[] height) {
        int max_area = 0, i = 0, j = height.length - 1, x = 0, y = 0, temp = 0;

        while (i < j) {
            y = (height[i] < height[j]) ? height[i] : height[j];
            x = j - i;

            temp = x * y;

            if (height[i] < height[j])
                i++;
            else
                j--;

            if (temp > max_area)
                max_area = temp;
        }

        return max_area;
    }
}

public class main {
    public static void main(String[] args) {

    }

}
