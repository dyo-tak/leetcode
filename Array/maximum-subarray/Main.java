class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], currentSum = 0;

        for (int n : nums) {
            if (currentSum < 0)
                currentSum = 0;
            currentSum += n;
            maxSum = max(maxSum, currentSum);
        }

        return maxSum;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}

public class Main {
    
}
