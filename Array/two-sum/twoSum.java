class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[] = { 0, 0 };
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (i == j)
                    break;
                if (nums[i] + nums[j] == target)
                {
                    sol[0] = i;
                    sol[1] = j;
                    break;
                }
                
            }
        }

        return sol;
    }
}

public class twoSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int sol[] = s.twoSum(nums, target);
        System.out.println(sol[0] + " " + sol[1]);
    }
}