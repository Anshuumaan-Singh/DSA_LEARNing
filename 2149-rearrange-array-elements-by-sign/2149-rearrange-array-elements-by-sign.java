class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int pIdx = 0; 
        int nIdx = 1; 
        
        for (int num : nums) {
            if (num > 0) {
                ans[pIdx] = num;
                pIdx += 2;
            } else {
                ans[nIdx] = num;
                nIdx += 2;
            }
        }
        return ans;
    }  
}