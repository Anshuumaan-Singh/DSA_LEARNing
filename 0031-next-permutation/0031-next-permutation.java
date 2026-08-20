class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        for(int i = n-1; i>0; i--){
            if(nums[i-1]<nums[i]){
                Arrays.sort(nums, i, nums.length);
                for(int j = i; j<n; j++){
                    if(nums[j]>nums[i-1]){
                        nums[i-1] = nums[i-1]+nums[j];
                        nums[j] = nums[i-1]-nums[j];
                        nums[i-1]=nums[i-1]-nums[j];
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
    }
}