class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int ele : nums){
            res = res^ele;
        }
        return res;
    }
}