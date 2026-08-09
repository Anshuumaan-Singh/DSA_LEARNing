class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            nums[j] = nums[i]*nums[i];
            j++;
        }
        Arrays.sort(nums);
        return nums;
    }
}