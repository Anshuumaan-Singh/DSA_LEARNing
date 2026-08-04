class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;  //This is done because rotating an array n times gives the same array.
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n - 1);
    }
     public void reverse(int[] nums, int i,int  j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
     }
}