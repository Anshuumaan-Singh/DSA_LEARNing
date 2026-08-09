class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            nums[j] = (int)(Math.pow(nums[i],2));
            j++;
        }
        Arrays.sort(nums);
        return nums;
    }
}