class Solution {
    public int search(int[] nums, int target) {
        int j = nums.length - 1, i = 0, middle = (i + j)/2;

		while (i <= j) {
			if (nums[middle] == target) return middle;
		    
			if (nums[middle] < target) i = middle + 1;	
	        
			if (nums[middle] > target) j = middle - 1;

			middle = (i + j)/2;
		}

		return -1;
    }
}

class Main {
	public static void main(String[] args) {
		int[] nums = {5};
		Solution sol = new Solution();

		System.out.println(sol.search(nums, 5));
	}
}
