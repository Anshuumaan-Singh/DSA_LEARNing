class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0, j = n - 1;
        int k = n - 1; 
        while (i <= j) {
            int leftSq = nums[i] * nums[i];
            int rightSq = nums[j] * nums[j];
            if (leftSq > rightSq) {
                arr[k--] = leftSq;
                i++;
            } else {
                arr[k--] = rightSq;
                j--;
            }
        }
        return arr;
    }
}